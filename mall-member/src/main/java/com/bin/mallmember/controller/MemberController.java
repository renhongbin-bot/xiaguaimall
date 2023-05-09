package com.bin.mallmember.controller;

import java.util.Arrays;
import java.util.Map;


import com.bin.mallmember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bin.mallmember.entity.MemberEntity;
import com.bin.mallmember.service.MemberService;
import com.bin.mallcommon.utils.PageUtils;
import com.bin.mallcommon.utils.R;



/**
 * 会员
 *
 * @author bin
 * @email 1239279122@qq.com
 * @date 2023-05-08 14:00:52
 */
// 热更新nacos配置
@RefreshScope
@RestController
@RequestMapping("mallmember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;


//    @Autowired
//    CouponFeignService couponFeignService;
//    @RequestMapping("/coupons")
//    public R test() {
//        MemberEntity memberEntity = new MemberEntity();
//        memberEntity.setNickname("张三");
//        R merbercoupons = couponFeignService.merbercoupons();
//        return R.ok().put("member", memberEntity).put("coupons", merbercoupons.get("coupons"));
//    }
    @Value("${member.user.name}")
    public String name;
    @Value("${member.user.age}")
    private Integer age;
    @RequestMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
