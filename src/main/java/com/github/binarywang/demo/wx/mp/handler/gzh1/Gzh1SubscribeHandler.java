package com.github.binarywang.demo.wx.mp.handler.gzh1;

import com.github.binarywang.demo.wx.mp.config.WxConfig;
import com.github.binarywang.demo.wx.mp.config.WxGzh1Config;
import com.github.binarywang.demo.wx.mp.handler.SubscribeHandler;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gzh1SubscribeHandler extends SubscribeHandler {
  @Autowired
  private WxGzh1Config wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

  @Override
  protected WxMpXmlOutMessage handleSpecial(WxMpXmlMessage wxMessage) {
    return null;
  }

}
