package com.psc.statement.controller;

import com.psc.statement.entity.*;
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
@RequestMapping("/baseData")
@Api(tags = "Basic-Bata", description = "基础数据")
public class BaseDateController {
    @GetMapping("/rain_data")
    @ApiOperation("查询时段降雨数据表")
    public CommonResult getRainData(@RequestParam(value = "startTime", required = false) String startTime,
                                    @RequestParam(value = "endTime", required = false) String endTime,
                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDataEntity rainDataEntity = new RainDataEntity();
        List<RainDataEntity> list = new ArrayList<>();
        list.add(rainDataEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/rain_daily")
    @ApiOperation("查询日降雨数据表")
    public CommonResult getRainDaily(@RequestParam(value = "startTime", required = false) String startTime,
                                     @RequestParam(value = "endTime", required = false) String endTime,
                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainDailyEntity rainDailyEntity = new RainDailyEntity();
        List<RainDailyEntity> list = new ArrayList<>();
        list.add(rainDailyEntity);
        return new CommonResult().success(list);
    }

    @GetMapping("/tbl_plot_coverage_info")
    @ApiOperation("植被覆盖")
    public CommonResult getTblPlotCoverageInfo(@RequestParam(value = "startTime", required = false) String startTime,
                                               @RequestParam(value = "endTime", required = false) String endTime,
                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        TblPlotCoverageInfoEntity data = new TblPlotCoverageInfoEntity();
        List<TblPlotCoverageInfoEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/sedimentRecordOfDrainageBasin")
    @ApiOperation("小流域径流泥沙记录表")
    public CommonResult getSedimentRecordOfDrainageBasin(@RequestParam(value = "startTime", required = false) String startTime,
                                                         @RequestParam(value = "endTime", required = false) String endTime,
                                                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        SedimentrecordofdrainagebasinEntity data = new SedimentrecordofdrainagebasinEntity();
        List<SedimentrecordofdrainagebasinEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/field_record")
    @ApiOperation("风蚀场田间管理记录表")
    public CommonResult getFieldRecord(@RequestParam(value = "startTime", required = false) String startTime,
                                       @RequestParam(value = "endTime", required = false) String endTime,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        FieldRecordEntity data = new FieldRecordEntity();
        List<FieldRecordEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/daily_record")
    @ApiOperation("风蚀场日常记录表")
    public CommonResult getDailyRecord(@RequestParam(value = "startTime", required = false) String startTime,
                                       @RequestParam(value = "endTime", required = false) String endTime,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        DailyRecordEntity data = new DailyRecordEntity();
        List<DailyRecordEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/sand_record")
    @ApiOperation("风蚀场风沙记录")
    public CommonResult getSandRecord(@RequestParam(value = "startTime", required = false) String startTime,
                                      @RequestParam(value = "endTime", required = false) String endTime,
                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        SandRecordEntity data = new SandRecordEntity();
        List<SandRecordEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/ground_ crude_record")
    @ApiOperation("地面粗糙度")
    public CommonResult getGroundCrudeRecord(@RequestParam(value = "startTime", required = false) String startTime,
                                             @RequestParam(value = "endTime", required = false) String endTime,
                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        GroundCrudeRecordEntity data = new GroundCrudeRecordEntity();
        List<GroundCrudeRecordEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/out_soil_dry")
    @ApiOperation("土壤水分湿度-野外土壤水分观测烘干法")
    public CommonResult getOutSoilDry(@RequestParam(value = "startTime", required = false) String startTime,
                                      @RequestParam(value = "endTime", required = false) String endTime,
                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        OutSoilDryEntity data = new OutSoilDryEntity();
        List<OutSoilDryEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/out_soil_tdr")
    @ApiOperation("土壤水分湿度-野外土壤水分观测TDR")
    public CommonResult getOutSoilTdr(@RequestParam(value = "startTime", required = false) String startTime,
                                      @RequestParam(value = "endTime", required = false) String endTime,
                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        OutSoilTdrEntity data = new OutSoilTdrEntity();
        List<OutSoilTdrEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/plot_soil_dry")
    @ApiOperation("土壤水分湿度-径流小区土壤水分观测烘干法")
    public CommonResult getPlotSoilDry(@RequestParam(value = "startTime", required = false) String startTime,
                                       @RequestParam(value = "endTime", required = false) String endTime,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PlotSoilDryEntity data = new PlotSoilDryEntity();
        List<PlotSoilDryEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/plot_soil_tdr")
    @ApiOperation("径流小区土壤水分观测TDR")
    public CommonResult getPlotSoilTdr(@RequestParam(value = "startTime", required = false) String startTime,
                                       @RequestParam(value = "endTime", required = false) String endTime,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PlotSoilTdrEntity data = new PlotSoilTdrEntity();
        List<PlotSoilTdrEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/measurePointSurvey")
    @ApiOperation("面源污染-面源污染测量点信息调查表")
    public CommonResult getMeasurePointSurvey(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        MeasurepointsurveyEntity data = new MeasurepointsurveyEntity();
        List<MeasurepointsurveyEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/measurePointFertilizationInfo ")
    @ApiOperation("面源污染-测量点调查施肥记录表")
    public CommonResult getMeasurePointFertilizationInfo(@RequestParam(value = "startTime", required = false) String startTime,
                                                         @RequestParam(value = "endTime", required = false) String endTime,
                                                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        MeasurepointfertilizationinfoEntity data = new MeasurepointfertilizationinfoEntity();
        List<MeasurepointfertilizationinfoEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/measurePointSprayInfo")
    @ApiOperation("面源污染-测量点调查喷洒农药记录表")
    public CommonResult getMeasurePointSprayInfo(@RequestParam(value = "startTime", required = false) String startTime,
                                                 @RequestParam(value = "endTime", required = false) String endTime,
                                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        MeasurepointsprayinfoEntity data = new MeasurepointsprayinfoEntity();
        List<MeasurepointsprayinfoEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/rainNutrientContent")
    @ApiOperation("面源污染-面源污染测量点养分含量测量表")
    public CommonResult getRainNutrientContent(@RequestParam(value = "startTime", required = false) String startTime,
                                               @RequestParam(value = "endTime", required = false) String endTime,
                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RainnutrientcontentEntity data = new RainnutrientcontentEntity();
        List<RainnutrientcontentEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/rpRunoffNutrientContent")
    @ApiOperation("面源污染-径流小区养分含量测量表")
    public CommonResult getRpRunoffNutrientContent(@RequestParam(value = "startTime", required = false) String startTime,
                                                   @RequestParam(value = "endTime", required = false) String endTime,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        RprunoffnutrientcontentEntity data = new RprunoffnutrientcontentEntity();
        List<RprunoffnutrientcontentEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/swRunoffNutrientContent")
    @ApiOperation("面源污染-小流域养分含量测量表")
    public CommonResult getSwRunoffNutrientContent(@RequestParam(value = "startTime", required = false) String startTime,
                                                   @RequestParam(value = "endTime", required = false) String endTime,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        SwrunoffnutrientcontentEntity data = new SwrunoffnutrientcontentEntity();
        List<SwrunoffnutrientcontentEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/tianjian_jilu")
    @ApiOperation("径流小区-田间管理记录表")
    public CommonResult getTianjianJilu(@RequestParam(value = "startTime", required = false) String startTime,
                                        @RequestParam(value = "endTime", required = false) String endTime,
                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        TianjianJiluEntity data = new TianjianJiluEntity();
        List<TianjianJiluEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }

    @GetMapping("/:Nisha_caiyang")
    @ApiOperation("径流小区-径流泥沙采样记录表")
    public CommonResult getNishaCaiyang(@RequestParam(value = "startTime", required = false) String startTime,
                                        @RequestParam(value = "endTime", required = false) String endTime,
                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        NishaCaiyangEntity data = new NishaCaiyangEntity();
        List<NishaCaiyangEntity> list = new ArrayList<>();
        list.add(data);
        return new CommonResult().success(list);
    }
}
