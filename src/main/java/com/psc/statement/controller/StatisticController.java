package com.psc.statement.controller;

import com.psc.statement.entity.RainDataEntity;
import com.psc.statement.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/statistic")
@Api(tags = "Statistical-Statement", description = "统计报表")
public class StatisticController {
    @GetMapping("/rain_daily")
    @ApiOperation("小区整编表-1 逐日降水量")
    public CommonResult getRainDaily(@RequestParam(value = "year", defaultValue = "2020") String year,
                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/rain_month")
    @ApiOperation("小区整编表-1 月统计降水量")
    public CommonResult getRainMonthly(@RequestParam(value = "year", defaultValue = "2020") String year,
                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/rain_year")
    @ApiOperation("小区整编表-1 年统计降水量")
    public CommonResult getRainYear(@RequestParam(value = "year", defaultValue = "2020") String year,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/rain_process")
    @ApiOperation("小区整编表-2 降水过程摘录")
    public CommonResult getRainProcess(@RequestParam(value = "year", defaultValue = "2020") String year,
                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/nongdi_info")
    @ApiOperation("径流小区整编表-3-1 径流小区基本情况（农地）")
    public CommonResult getNongDiInfo(@RequestParam(value = "year", defaultValue = "2020") String year,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/lindi_info")
    @ApiOperation("径流小区整编表-3-2 径流小区基本情况（林地）")
    public CommonResult getLinDiInfo(@RequestParam(value = "year", defaultValue = "2020") String year,
                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/guanzaodi_info")
    @ApiOperation("径流小区整编表-3-3 径流小区基本情况（灌草地）")
    public CommonResult getGuanCaoInfo(@RequestParam(value = "year", defaultValue = "2020") String year,
                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/tianjian_jilu")
    @ApiOperation("径流小区整编表-4 径流小区田间管理")
    public CommonResult getTianJianJilu(@RequestParam(value = "year", defaultValue = "2020") String year,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/jinliu_nisha")
    @ApiOperation("径流小区整编表-5 径流小区逐次径流泥沙")
    public CommonResult getJinLiuNiSha(@RequestParam(value = "year", defaultValue = "2020") String year,
                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/nisha_nian")
    @ApiOperation("径流小区整编表-6 径流小区逐年径流泥沙")
    public CommonResult getNiShaNian(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/water_plant_content")
    @ApiOperation("径流小区土壤含水量和植被盖度")
    public CommonResult getWaterPlantContent(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_tianjian_jilu")
    @ApiOperation("风蚀场田间管理记录表")
    public CommonResult getFengShi(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_richang_jilu")
    @ApiOperation("风蚀场日常维护记录表")
    public CommonResult getFengShiRichang(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_fengsha_jilu")
    @ApiOperation("风蚀场风沙观测记录表")
    public CommonResult getFengShiFengsha(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_dimian_jilu")
    @ApiOperation("风蚀场地面粗糙度观测记录表")
    public CommonResult getFengShiDiMian(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_fengsu_jilu")
    @ApiOperation("风蚀场风速自动观测记录")
    public CommonResult getFengShiFengSu(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/fengshi_shuifeng_jilu")
    @ApiOperation("风蚀场土壤水分温度观测记录")
    public CommonResult getFengShishuifeng(@RequestParam(value = "year", defaultValue = "2020") String year) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }
}
