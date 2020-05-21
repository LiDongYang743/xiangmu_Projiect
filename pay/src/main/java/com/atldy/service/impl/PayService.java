package com.atldy.service.impl;

import com.atldy.service.IPayService;
import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

/**
 * @author shkstart
 * @create 2020-05-21 20:38
 */
@Service
@Slf4j
public class PayService implements IPayService {


    @Override
    public void create(Integer orderId, BigDecimal amount) {
        //微信支付配置
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("xxxxx");          //公众号Id
        wxPayConfig.setMiniAppId("xxxxx");      //小程序Id
        wxPayConfig.setAppAppId("xxxxx");       //移动AppId
        //支付商户资料
        wxPayConfig.setMchId("xxxxxx");
        wxPayConfig.setMchKey("xxxxxxx");
        wxPayConfig.setNotifyUrl("http://xxxxx");

        //支付宝配置
        AliPayConfig aliPayConfig = new AliPayConfig();
        aliPayConfig.setAppId("xxxxxx");
        aliPayConfig.setPrivateKey("xxxxxx");
        aliPayConfig.setAliPayPublicKey("xxxxxx");
        aliPayConfig.setReturnUrl("http://xxxxx");
        aliPayConfig.setNotifyUrl("http://xxxxx");

        //支付类, 所有方法都在这个类里
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        bestPayService.setAliPayConfig(aliPayConfig);

    }
}
