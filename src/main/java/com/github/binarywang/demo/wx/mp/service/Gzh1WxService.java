package com.github.binarywang.demo.wx.mp.service;

import com.github.binarywang.demo.wx.mp.config.WxConfig;
import com.github.binarywang.demo.wx.mp.config.WxGzh1Config;
import com.github.binarywang.demo.wx.mp.handler.*;
import com.github.binarywang.demo.wx.mp.handler.gzh1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Binary Wang
 */
@Service
public class Gzh1WxService extends BaseWxService {
  @Autowired
  private WxGzh1Config wxConfig;

  @Autowired
  private Gzh1LocationHandler locationHandler;

  @Autowired
  private Gzh1MenuHandler menuHandler;

  @Autowired
  private Gzh1MsgHandler msgHandler;

  @Autowired
  private Gzh1UnSubscribeHandler unSubscribeHandler;

  @Autowired
  private Gzh1SubscribeHandler subscribeHandler;

  @Override
  protected WxConfig getServerConfig() {
    return this.wxConfig;
  }

  @Override
  protected MenuHandler getMenuHandler() {
    return this.menuHandler;
  }

  @Override
  protected SubscribeHandler getSubscribeHandler() {
    return this.subscribeHandler;
  }

  @Override
  protected UnsubscribeHandler getUnsubscribeHandler() {
    return this.unSubscribeHandler;
  }

  @Override
  protected AbstractHandler getLocationHandler() {
    return this.locationHandler;
  }

  @Override
  protected MsgHandler getMsgHandler() {
    return this.msgHandler;
  }

  @Override
  protected AbstractHandler getScanHandler() {
    return null;
  }

}
