package com.github.binarywang.demo.wx.mp.handler;

import com.alibaba.fastjson.JSON;
import com.github.binarywang.demo.wx.mp.builder.AbstractBuilder;
import com.github.binarywang.demo.wx.mp.builder.ImageBuilder;
import com.github.binarywang.demo.wx.mp.builder.TextBuilder;
import com.github.binarywang.demo.wx.mp.dto.WxMenuKey;
import com.github.binarywang.demo.wx.mp.service.BaseWxService;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.XmlMsgType;

/**
 * @author Binary Wang
 */
public abstract class MenuHandler extends AbstractHandler {

  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                  Map<String, Object> context, WxMpService wxMpService,
                                  WxSessionManager sessionManager) {
    BaseWxService weixinService = (BaseWxService) wxMpService;

    String key = wxMessage.getEventKey();
    WxMenuKey menuKey = null;
    try {
      menuKey = JSON.parseObject(key, WxMenuKey.class);
    } catch (Exception e) {
      return WxMpXmlOutMessage.TEXT().content(key)
          .fromUser(wxMessage.getToUser())
          .toUser(wxMessage.getFromUser()).build();
    }

    AbstractBuilder builder = null;
    switch (menuKey.getType()) {
      case XmlMsgType.TEXT:
        builder = new TextBuilder();
        break;
      case XmlMsgType.IMAGE:
        builder = new ImageBuilder();
        break;
      case XmlMsgType.VOICE:
        break;
      case XmlMsgType.VIDEO:
        break;
      case XmlMsgType.NEWS:
        break;
      default:
        break;
    }

    if (builder != null) {
      try {
        return builder.build(menuKey.getContent(), wxMessage, weixinService);
      } catch (Exception e) {
        log.error(e.getMessage(), e);
      }
    }

    return null;

  }

}
