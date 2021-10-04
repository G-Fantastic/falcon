/*
 * Copyright (C) 2021 iofairy, <https://github.com/iofairy/falcon>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iofairy.falcon.time;

import com.iofairy.top.G;

import java.util.regex.Pattern;

import static com.iofairy.falcon.time.DateTimeSeparator.*;
import static com.iofairy.pattern.Pattern.*;

/**
 * 时间格式化解析类
 *
 * @since 0.0.2
 */
public class DateTimePattern {
    /*
     * DASH:  d   -
     * DOT:   o   .
     * SLASH: s   /
     * COLON: c   :
     * ZH:    z   年月日时分秒毫秒
     */
    public static final Pattern Y = Pattern.compile("\\d{3,4}");                                                                            // yyyy
    public static final Pattern YM = Pattern.compile("\\d{6}");                                                                             // yyyyMM
    public static final Pattern YMD = Pattern.compile("\\d{8}");                                                                            // yyyyMMdd
    public static final Pattern YMDH = Pattern.compile("\\d{10}");                                                                          // yyyyMMddHH
    public static final Pattern YMDHM = Pattern.compile("\\d{12}");                                                                         // yyyyMMddHHmm
    public static final Pattern YMDHMS = Pattern.compile("\\d{14}");                                                                        // yyyyMMddHHmmss
    public static final Pattern YMDHMSS = Pattern.compile("\\d{17}");                                                                       // yyyyMMddHHmmssSSS
    public static final Pattern MdD = Pattern.compile("\\d{1,2}-\\d{1,2}");                                                                 // M-d
    public static final Pattern MsD = Pattern.compile("\\d{1,2}/\\d{1,2}");                                                                 // M/d
    public static final Pattern MoD = Pattern.compile("\\d{1,2}\\.\\d{1,2}");                                                               // M.d
    public static final Pattern HcM = Pattern.compile("\\d{1,2}:\\d{1,2}");                                                                 // H:m
    public static final Pattern Yz = Pattern.compile("\\d{3,4}年");                                                                          // yyyy年
    public static final Pattern MzDz = Pattern.compile("\\d{1,2}月\\d{1,2}日");                                                              // M月d日
    public static final Pattern MzSz = Pattern.compile("\\d{1,2}分\\d{1,2}秒");                                                              // m分s秒
    public static final Pattern HzMz = Pattern.compile("\\d{1,2}时\\d{1,2}分");                                                              // H时m分
    public static final Pattern HoMz = Pattern.compile("\\d{1,2}点\\d{1,2}分");                                                              // H点m分
    public static final Pattern McSS = Pattern.compile("\\d{1,2}:\\d{1,2}\\.\\d{1,3}");                                                     // m:s.S
    public static final Pattern HcMcS = Pattern.compile("\\d{1,2}:\\d{1,2}:\\d{1,2}");                                                      // H:m:s
    public static final Pattern MdDH = Pattern.compile("\\d{1,2}-\\d{1,2} \\d{1,2}");                                                       // M-d H
    public static final Pattern MsDH = Pattern.compile("\\d{1,2}/\\d{1,2} \\d{1,2}");                                                       // M/d H
    public static final Pattern MoDH = Pattern.compile("\\d{1,2}\\.\\d{1,2} \\d{1,2}");                                                     // M.d H
    public static final Pattern YdM = Pattern.compile("\\d{3,4}-\\d{1,2}");                                                                 // yyyy-M
    public static final Pattern YsM = Pattern.compile("\\d{3,4}/\\d{1,2}");                                                                 // yyyy/M
    public static final Pattern YoM = Pattern.compile("\\d{3,4}\\.\\d{1,2}");                                                               // yyyy.M
    public static final Pattern HzMzSz = Pattern.compile("\\d{1,2}时\\d{1,2}分\\d{1,2}秒");                                                  // H时m分s秒
    public static final Pattern HoMzSz = Pattern.compile("\\d{1,2}点\\d{1,2}分\\d{1,2}秒");                                                  // H点m分s秒
    public static final Pattern MzDzHz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}时");                                                  // M月d日H时
    public static final Pattern MzDzHo = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}点");                                                  // M月d日H点
    public static final Pattern HcMcSS = Pattern.compile("\\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");                                          // H:m:s.S
    public static final Pattern MdDHcM = Pattern.compile("\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}");                                            // M-d H:m
    public static final Pattern MsDHcM = Pattern.compile("\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}");                                            // M/d H:m
    public static final Pattern MoDHcM = Pattern.compile("\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}");                                          // M.d H:m
    public static final Pattern YzMz = Pattern.compile("\\d{3,4}年\\d{1,2}月");                                                              // yyyy年M月
    public static final Pattern MzSzSz = Pattern.compile("\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");                                                 // m分s秒S毫秒
    public static final Pattern YdMdD = Pattern.compile("\\d{3,4}-\\d{1,2}-\\d{1,2}");                                                      // yyyy-M-d
    public static final Pattern YsMsD = Pattern.compile("\\d{3,4}/\\d{1,2}/\\d{1,2}");                                                      // yyyy/M/d
    public static final Pattern YoMoD = Pattern.compile("\\d{3,4}\\.\\d{1,2}\\.\\d{1,2}");                                                  // yyyy.M.d
    public static final Pattern MzDzHzMz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分");                                       // M月d日H时m分
    public static final Pattern MzDzHoMz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分");                                       // M月d日H点m分
    public static final Pattern MdDHcMcS = Pattern.compile("\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                                 // M-d H:m:s
    public static final Pattern MsDHcMcS = Pattern.compile("\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                                 // M/d H:m:s
    public static final Pattern MoDHcMcS = Pattern.compile("\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                               // M.d H:m:s
    public static final Pattern YzMzDz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日");                                                  // yyyy年M月d日
    public static final Pattern HzMzSzSz = Pattern.compile("\\d{1,2}时\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");                                     // H时m分s秒S毫秒
    public static final Pattern HoMzSzSz = Pattern.compile("\\d{1,2}点\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");                                     // H点m分s秒S毫秒
    public static final Pattern YdMdDH = Pattern.compile("\\d{3,4}-\\d{1,2}-\\d{1,2} \\d{1,2}");                                            // yyyy-M-d H
    public static final Pattern YsMsDH = Pattern.compile("\\d{3,4}/\\d{1,2}/\\d{1,2} \\d{1,2}");                                            // yyyy/M/d H
    public static final Pattern YoMoDH = Pattern.compile("\\d{3,4}\\.\\d{1,2}\\.\\d{1,2} \\d{1,2}");                                        // yyyy.M.d H
    public static final Pattern MzDzHzMzSz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分\\d{1,2}秒");                           // M月d日H时m分s秒
    public static final Pattern MzDzHoMzSz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分\\d{1,2}秒");                           // M月d日H点m分s秒
    public static final Pattern MdDHcMcSS = Pattern.compile("\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");                     // M-d H:m:s.S
    public static final Pattern MsDHcMcSS = Pattern.compile("\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");                     // M/d H:m:s.S
    public static final Pattern MoDHcMcSS = Pattern.compile("\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");                   // M.d H:m:s.S
    public static final Pattern YzMzDzHz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}时");                                       // yyyy年M月d日H时
    public static final Pattern YzMzDzHo = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}点");                                       // yyyy年M月d日H点
    public static final Pattern YdMdDHcM = Pattern.compile("\\d{3,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}");                                 // yyyy-M-d H:m
    public static final Pattern YsMsDHcM = Pattern.compile("\\d{3,4}/\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}");                                 // yyyy/M/d H:m
    public static final Pattern YoMoDHcM = Pattern.compile("\\d{3,4}\\.\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}");                             // yyyy.M.d H:m
    public static final Pattern MzDzHzMzSzSz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");              // M月d日H时m分s秒S毫秒
    public static final Pattern MzDzHoMzSzSz = Pattern.compile("\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");              // M月d日H点m分s秒S毫秒
    public static final Pattern YzMzDzHzMz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分");                           // yyyy年M月d日H时m分
    public static final Pattern YzMzDzHoMz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分");                           // yyyy年M月d日H点m分
    public static final Pattern YdMdDHcMcS = Pattern.compile("\\d{3,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                      // yyyy-M-d H:m:s
    public static final Pattern YsMsDHcMcS = Pattern.compile("\\d{3,4}/\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                      // yyyy/M/d H:m:s
    public static final Pattern YoMoDHcMcS = Pattern.compile("\\d{3,4}\\.\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}");                  // yyyy.M.d H:m:s
    public static final Pattern YzMzDzHzMzSz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分\\d{1,2}秒");               // yyyy年M月d日H时m分s秒
    public static final Pattern YzMzDzHoMzSz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分\\d{1,2}秒");               // yyyy年M月d日H点m分s秒
    public static final Pattern YdMdDHcMcSS = Pattern.compile("\\d{3,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");          // yyyy-M-d H:m:s.S
    public static final Pattern YsMsDHcMcSS = Pattern.compile("\\d{3,4}/\\d{1,2}/\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");          // yyyy/M/d H:m:s.S
    public static final Pattern YoMoDHcMcSS = Pattern.compile("\\d{3,4}\\.\\d{1,2}\\.\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}");      // yyyy.M.d H:m:s.S
    public static final Pattern YzMzDzHzMzSzSz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}时\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");  // yyyy年M月d日H时m分s秒S毫秒
    public static final Pattern YzMzDzHoMzSzSz = Pattern.compile("\\d{3,4}年\\d{1,2}月\\d{1,2}日\\d{1,2}点\\d{1,2}分\\d{1,2}秒\\d{1,3}毫秒");  // yyyy年M月d日H点m分s秒S毫秒
    /*
     * 时间格式化（FORMAT）字符串
     */
    public static final String FM_Y = "yyyy";
    public static final String FM_YM = "yyyyMM";
    public static final String FM_YMD = "yyyyMMdd";
    public static final String FM_YMDH = "yyyyMMddHH";
    public static final String FM_YMDHM = "yyyyMMddHHmm";
    public static final String FM_YMDHMS = "yyyyMMddHHmmss";
    public static final String FM_YMDHMSS = "yyyyMMddHHmmssSSS";
    public static final String FM_MdD = "MM-dd";
    public static final String FM_MsD = "MM/dd";
    public static final String FM_MoD = "MM.dd";
    public static final String FM_HcM = "HH:mm";
    public static final String FM_Yz = "yyyy年";
    public static final String FM_MzDz = "MM月dd日";
    public static final String FM_MzSz = "mm分ss秒";
    public static final String FM_HzMz = "HH时mm分";
    public static final String FM_HoMz = "HH点mm分";
    public static final String FM_McSS = "mm:ss.SSS";
    public static final String FM_HcMcS = "HH:mm:ss";
    public static final String FM_MdDH = "MM-dd HH";
    public static final String FM_MsDH = "MM/dd HH";
    public static final String FM_MoDH = "MM.dd HH";
    public static final String FM_YdM = "yyyy-MM";
    public static final String FM_YsM = "yyyy/MM";
    public static final String FM_YoM = "yyyy.MM";
    public static final String FM_HzMzSz = "HH时mm分ss秒";
    public static final String FM_HoMzSz = "HH点mm分ss秒";
    public static final String FM_MzDzHz = "MM月dd日HH时";
    public static final String FM_MzDzHo = "MM月dd日HH点";
    public static final String FM_HcMcSS = "HH:mm:ss.SSS";
    public static final String FM_MdDHcM = "MM-dd HH:mm";
    public static final String FM_MsDHcM = "MM/dd HH:mm";
    public static final String FM_MoDHcM = "MM.dd HH:mm";
    public static final String FM_YzMz = "yyyy年MM月";
    public static final String FM_MzSzSz = "mm分ss秒SSS毫秒";
    public static final String FM_YdMdD = "yyyy-MM-dd";
    public static final String FM_YsMsD = "yyyy/MM/dd";
    public static final String FM_YoMoD = "yyyy.MM.dd";
    public static final String FM_MzDzHzMz = "MM月dd日HH时mm分";
    public static final String FM_MzDzHoMz = "MM月dd日HH点mm分";
    public static final String FM_MdDHcMcS = "MM-dd HH:mm:ss";
    public static final String FM_MsDHcMcS = "MM/dd HH:mm:ss";
    public static final String FM_MoDHcMcS = "MM.dd HH:mm:ss";
    public static final String FM_YzMzDz = "yyyy年MM月dd日";
    public static final String FM_HzMzSzSz = "HH时mm分ss秒SSS毫秒";
    public static final String FM_HoMzSzSz = "HH点mm分ss秒SSS毫秒";
    public static final String FM_YdMdDH = "yyyy-MM-dd HH";
    public static final String FM_YsMsDH = "yyyy/MM/dd HH";
    public static final String FM_YoMoDH = "yyyy.MM.dd HH";
    public static final String FM_MzDzHzMzSz = "MM月dd日HH时mm分ss秒";
    public static final String FM_MzDzHoMzSz = "MM月dd日HH点mm分ss秒";
    public static final String FM_MdDHcMcSS = "MM-dd HH:mm:ss.SSS";
    public static final String FM_MsDHcMcSS = "MM/dd HH:mm:ss.SSS";
    public static final String FM_MoDHcMcSS = "MM.dd HH:mm:ss.SSS";
    public static final String FM_YzMzDzHz = "yyyy年MM月dd日HH时";
    public static final String FM_YzMzDzHo = "yyyy年MM月dd日HH点";
    public static final String FM_YdMdDHcM = "yyyy-MM-dd HH:mm";
    public static final String FM_YsMsDHcM = "yyyy/MM/dd HH:mm";
    public static final String FM_YoMoDHcM = "yyyy.MM.dd HH:mm";
    public static final String FM_MzDzHzMzSzSz = "MM月dd日HH时mm分ss秒SSS毫秒";
    public static final String FM_MzDzHoMzSzSz = "MM月dd日HH点mm分ss秒SSS毫秒";
    public static final String FM_YzMzDzHzMz = "yyyy年MM月dd日HH时mm分";
    public static final String FM_YzMzDzHoMz = "yyyy年MM月dd日HH点mm分";
    public static final String FM_YdMdDHcMcS = "yyyy-MM-dd HH:mm:ss";
    public static final String FM_YsMsDHcMcS = "yyyy/MM/dd HH:mm:ss";
    public static final String FM_YoMoDHcMcS = "yyyy.MM.dd HH:mm:ss";
    public static final String FM_YzMzDzHzMzSz = "yyyy年MM月dd日HH时mm分ss秒";
    public static final String FM_YzMzDzHoMzSz = "yyyy年MM月dd日HH点mm分ss秒";
    public static final String FM_YdMdDHcMcSS = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String FM_YsMsDHcMcSS = "yyyy/MM/dd HH:mm:ss.SSS";
    public static final String FM_YoMoDHcMcSS = "yyyy.MM.dd HH:mm:ss.SSS";
    public static final String FM_YzMzDzHzMzSzSz = "yyyy年MM月dd日HH时mm分ss秒SSS毫秒";
    public static final String FM_YzMzDzHoMzSzSz = "yyyy年MM月dd日HH点mm分ss秒SSS毫秒";


    /**
     * Pattern for new date api {@link java.time.LocalDateTime}, {@link java.time.LocalDate},
     * {@link java.time.LocalTime} using {@link java.time.format.DateTimeFormatter} <br>
     * 通过给定的时间串解析出匹配的时间格式串，适用于 {@link java.time.format.DateTimeFormatter}
     *
     * @param dateTime 时间串
     * @return 时间格式串，如：yyyy-MM-dd HH:mm:ss.SSS
     */
    public static String forLocalDT(final String dateTime) {
        if (G.isBlank(dateTime)) return null;
        int length = dateTime.length();
        if (length < 4 || length > 25) return null;

        DateTimeSeparator dts = null;
        switch (length) {
            case 4:
                // yyyy
                return matchPattern(Y, dateTime, FM_Y);
            case 5:
                // yyyy年，HH:mm
                return matchPattern(cs(Yz, HcM), dateTime, FM_Yz, FM_HcM);
            case 6:
                // yyyyMM 、HH时mm分
                return matchPattern(cs(YM, HzMz, HoMz), dateTime, FM_YM, FM_HzMz, FM_HoMz);
            case 7:
                // yyyy.MM
                return matchPattern(cs(YdM, YsM, YoM), dateTime, FM_YdM, FM_YsM, FM_YoM);
            case 8:
                // yyyyMMdd 、HH:mm:ss 、 yyyy年MM月
                return matchPattern(cs(YMD, HcMcS, YzMz), dateTime, FM_YMD, FM_HcMcS, FM_YzMz);
            case 9:
                // HH时mm分ss秒
                return matchPattern(cs(HzMzSz, HoMzSz), dateTime, FM_HzMzSz, FM_HoMzSz);
            case 10:
                // yyyyMMddHH 、 yyyy.MM.dd
                return matchPattern(cs(YMDH, YdMdD, YsMsD, YoMoD), dateTime, FM_YMDH, FM_YdMdD, FM_YsMsD, FM_YoMoD);
            case 11:
                // yyyy年MM月dd日
                return matchPattern(YzMzDz, dateTime, FM_YzMzDz);
            case 12:
                // yyyyMMddHHmm 、 HH:mm:ss.SSS
                return matchPattern(cs(YMDHM, HcMcSS), dateTime, FM_YMDHM, FM_HcMcSS);
            case 13:
                // yyyy.MM.dd HH
                return matchPattern(cs(YdMdDH, YsMsDH, YoMoDH), dateTime, FM_YdMdDH, FM_YsMsDH, FM_YoMoDH);
            case 14:
                // yyyyMMddHHmmss 、HH时mm分ss秒SSS毫秒 、 yyyy年MM月dd日HH时
                return matchPattern(cs(YMDHMS, HzMzSzSz, HoMzSzSz, YzMzDzHz, YzMzDzHo), dateTime,
                        FM_YMDHMS, FM_HzMzSzSz, FM_HoMzSzSz, FM_YzMzDzHz, FM_YzMzDzHo);
            case 16:
                // yyyy.MM.dd HH:mm
                return matchPattern(cs(YdMdDHcM, YsMsDHcM, YoMoDHcM), dateTime, FM_YdMdDHcM, FM_YsMsDHcM, FM_YoMoDHcM);
            case 17:
                // yyyyMMddHHmmssSSS 、 yyyy年MM月dd日HH时mm分
                return matchPattern(cs(YMDHMSS, YzMzDzHzMz, YzMzDzHoMz), dateTime, FM_YMDHMSS, FM_YzMzDzHzMz, FM_YzMzDzHoMz);
            case 19:
                // yyyy.MM.dd HH:mm:ss
                return matchPattern(cs(YdMdDHcMcS, YsMsDHcMcS, YoMoDHcMcS), dateTime, FM_YdMdDHcMcS, FM_YsMsDHcMcS, FM_YoMoDHcMcS);
            case 20:
                // yyyy年MM月dd日HH时mm分ss秒
                return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz), dateTime, FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz);
            case 23:
                // yyyy.MM.dd HH:mm:ss.SSS
                return matchPattern(cs(YdMdDHcMcSS, YsMsDHcMcSS, YoMoDHcMcSS), dateTime, FM_YdMdDHcMcSS, FM_YsMsDHcMcSS, FM_YoMoDHcMcSS);
            case 25:
                // yyyy年MM月dd日HH时mm分ss秒SSS毫秒
                return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz), dateTime, FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz);
        }

        return null;
    }

    /**
     * Pattern for {@link java.util.Date} using {@link java.text.SimpleDateFormat} <br>
     * 通过给定的时间串解析出匹配的时间格式串，适用于 {@link java.text.SimpleDateFormat}
     *
     * @param dateTime 时间串
     * @return 时间格式串，如：yyyy-MM-dd HH:mm:ss.SSS
     */
    public static String forDate(final String dateTime) {
        if (G.isBlank(dateTime)) return null;
        int length = dateTime.length();
        if (length < 3 || length > 25) return null;

        DateTimeSeparator dts = null;
        String format = null;
        switch (length) {
            case 3:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(Y, dateTime, FM_Y);
                    case COLON:
                        return matchPattern(HcM, dateTime, FM_HcM);
                    case DASH:
                        return matchPattern(MdD, dateTime, FM_MdD);
                    case SLASH:
                        return matchPattern(MsD, dateTime, FM_MsD);
                    case DOT:
                        return matchPattern(MoD, dateTime, FM_MoD);
                }
                return null;

            case 4:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(Y, dateTime, FM_Y);
                    case SLASH:
                        return matchPattern(MsD, dateTime, FM_MsD);
                    case DASH:
                        return matchPattern(MdD, dateTime, FM_MdD);
                    case DOT:
                        return matchPattern(MoD, dateTime, FM_MoD);
                    case COLON:
                        return matchPattern(HcM, dateTime, FM_HcM);
                    case ZH_TIME:
                        return matchPattern(cs(HzMz, HoMz, MzSz), dateTime, FM_HzMz, FM_HoMz, FM_MzSz);
                    case ZH_DATE:
                        return matchPattern(cs(Yz, MzDz), dateTime, FM_Yz, FM_MzDz);
                }
                return null;
            case 5:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case COLON_DOT:
                        return matchPattern(McSS, dateTime, FM_McSS);
                    case SLASH_COLON:
                        return matchPattern(MsDH, dateTime, FM_MsDH);
                    case DASH_COLON:
                        return matchPattern(MdDH, dateTime, FM_MdDH);
                    case DOT_COLON:
                        return matchPattern(MoDH, dateTime, FM_MoDH);
                    case SLASH:
                        return matchPattern(cs(YsM, MsD), dateTime, FM_YsM, FM_MsD);
                    case DASH:
                        return matchPattern(cs(YdM, MdD), dateTime, FM_YdM, FM_MdD);
                    case DOT:
                        return matchPattern(cs(YoM, MoD), dateTime, FM_YoM, FM_MoD);
                    case COLON:
                        return matchPattern(cs(HcMcS, HcM), dateTime, FM_HcMcS, FM_HcM);
                    case ZH_TIME:
                        return matchPattern(cs(HzMz, HoMz, MzSz), dateTime, FM_HzMz, FM_HoMz, FM_MzSz);
                    case ZH_DATE:
                        return matchPattern(cs(Yz, MzDz), dateTime, FM_Yz, FM_MzDz);
                }
                return null;
            case 6:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(YM, dateTime, FM_YM);
                    case COLON_DOT:
                        return matchPattern(McSS, dateTime, FM_McSS);
                    case SLASH_COLON:
                        return matchPattern(MsDH, dateTime, FM_MsDH);
                    case DASH_COLON:
                        return matchPattern(MdDH, dateTime, FM_MdDH);
                    case DOT_COLON:
                        return matchPattern(MoDH, dateTime, FM_MoDH);
                    case SLASH:
                        return matchPattern(YsM, dateTime, FM_YsM);
                    case DASH:
                        return matchPattern(YdM, dateTime, FM_YdM);
                    case DOT:
                        return matchPattern(YoM, dateTime, FM_YoM);
                    case COLON:
                        return matchPattern(HcMcS, dateTime, FM_HcMcS);
                    case ZH_ZH:
                        return matchPattern(cs(MzDzHz, MzDzHo), dateTime, FM_MzDzHz, FM_MzDzHo);
                    case ZH_TIME:
                        return matchPattern(cs(HzMzSz, HoMzSz, HzMz, HoMz, MzSz), dateTime,
                                FM_HzMzSz, FM_HoMzSz, FM_HzMz, FM_HoMz, FM_MzSz);
                    case ZH_DATE:
                        return matchPattern(cs(YzMz, MzDz), dateTime, FM_YzMz, FM_MzDz);
                }
                return null;
            case 7:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case COLON_DOT:
                        return matchPattern(cs(HcMcSS, McSS), dateTime, FM_HcMcSS, FM_McSS);
                    case SLASH_COLON:
                        return matchPattern(cs(MsDHcM, MsDH), dateTime, FM_MsDHcM, FM_MsDH);
                    case DASH_COLON:
                        return matchPattern(cs(MdDHcM, MdDH), dateTime, FM_MdDHcM, FM_MdDH);
                    case DOT_COLON:
                        return matchPattern(cs(MoDHcM, MoDH), dateTime, FM_MoDHcM, FM_MoDH);
                    case SLASH:
                        return matchPattern(cs(YsMsD, YsM), dateTime, FM_YsMsD, FM_YsM);
                    case DASH:
                        return matchPattern(cs(YdMdD, YdM), dateTime, FM_YdMdD, FM_YdM);
                    case DOT:
                        return matchPattern(cs(YoMoD, YoM), dateTime, FM_YoMoD, FM_YoM);
                    case COLON:
                        return matchPattern(HcMcS, dateTime, FM_HcMcS);
                    case ZH_TIME_MS:
                        return matchPattern(MzSzSz,  dateTime, FM_MzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(MzDzHz, MzDzHo), dateTime, FM_MzDzHz, FM_MzDzHo);
                    case ZH_TIME:
                        return matchPattern(cs(HzMzSz, HoMzSz), dateTime, FM_HzMzSz, FM_HoMzSz);
                    case ZH_DATE:
                        return matchPattern(YzMz, dateTime, FM_YzMz);
                }
                return null;
            case 8:
                // 最常用，先检测
                format = matchPattern(HcMcS, dateTime, FM_HcMcS);
                if (null == format) {
                    dts = separatorForDate(dateTime);
                    switch (dts) {
                        case NO_SEPARATOR:
                            return matchPattern(YMD, dateTime, FM_YMD);
                        case COLON_DOT:
                            return matchPattern(cs(HcMcSS, McSS), dateTime, FM_HcMcSS, FM_McSS);
                        case SLASH_COLON:
                            return matchPattern(cs(MsDHcM, MsDH), dateTime, FM_MsDHcM, FM_MsDH);
                        case DASH_COLON:
                            return matchPattern(cs(MdDHcM, MdDH), dateTime, FM_MdDHcM, FM_MdDH);
                        case DOT_COLON:
                            return matchPattern(cs(MoDHcM, MoDH), dateTime, FM_MoDHcM, FM_MoDH);
                        case SLASH:
                            return matchPattern(YsMsD, dateTime, FM_YsMsD);
                        case DASH:
                            return matchPattern(YdMdD, dateTime, FM_YdMdD);
                        case DOT:
                            return matchPattern(YoMoD, dateTime, FM_YoMoD);
                        case ZH_TIME_MS:
                            return matchPattern(MzSzSz,  dateTime, FM_MzSzSz);
                        case ZH_ZH:
                            return matchPattern(cs(MzDzHzMz, MzDzHoMz, MzDzHz, MzDzHo), dateTime,
                                    FM_MzDzHzMz, FM_MzDzHoMz, FM_MzDzHz, FM_MzDzHo);
                        case ZH_TIME:
                            return matchPattern(cs(HzMzSz, HoMzSz), dateTime, FM_HzMzSz, FM_HoMzSz);
                        case ZH_DATE:
                            return matchPattern(cs(YzMzDz, YzMz), dateTime, FM_YzMzDz, FM_YzMz);
                    }
                    return null;
                }else {
                    return format;
                }
            case 9:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case COLON_DOT:
                        return matchPattern(cs(HcMcSS, McSS), dateTime, FM_HcMcSS, FM_McSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDH, MsDHcMcS, MsDHcM), dateTime, FM_YsMsDH, FM_MsDHcMcS, FM_MsDHcM);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDH, MdDHcMcS, MdDHcM), dateTime, FM_YdMdDH, FM_MdDHcMcS, FM_MdDHcM);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDH, MoDHcMcS, MoDHcM), dateTime, FM_YoMoDH, FM_MoDHcMcS, FM_MoDHcM);
                    case SLASH:
                        return matchPattern(YsMsD, dateTime, FM_YsMsD);
                    case DASH:
                        return matchPattern(YdMdD, dateTime, FM_YdMdD);
                    case DOT:
                        return matchPattern(YoMoD, dateTime, FM_YoMoD);
                    case ZH_TIME_MS:
                        return matchPattern(cs(HzMzSzSz, HoMzSzSz, MzSzSz),  dateTime, FM_HzMzSzSz, FM_HoMzSzSz, FM_MzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(MzDzHzMz, MzDzHoMz, MzDzHz, MzDzHo), dateTime,
                                FM_MzDzHzMz, FM_MzDzHoMz, FM_MzDzHz, FM_MzDzHo);
                    case ZH_TIME:
                        return matchPattern(cs(HzMzSz, HoMzSz), dateTime, FM_HzMzSz, FM_HoMzSz);
                    case ZH_DATE:
                        return matchPattern(YzMzDz, dateTime, FM_YzMzDz);
                }
                return null;
            case 10:
                // 最常用，先检测
                format = matchPattern(YdMdD, dateTime, FM_YdMdD);
                if (null == format) {
                    dts = separatorForDate(dateTime);
                    switch (dts) {
                        case NO_SEPARATOR:
                            return matchPattern(YMDH, dateTime, FM_YMDH);
                        case COLON_DOT:
                            return matchPattern(HcMcSS, dateTime, FM_HcMcSS);
                        case SLASH_COLON:
                            return matchPattern(cs(YsMsDH, MsDHcMcS, MsDHcM), dateTime, FM_YsMsDH, FM_MsDHcMcS, FM_MsDHcM);
                        case DASH_COLON:
                            return matchPattern(cs(YdMdDH, MdDHcMcS, MdDHcM), dateTime,  FM_YdMdDH, FM_MdDHcMcS, FM_MdDHcM);
                        case DOT_COLON:
                            return matchPattern(cs(YoMoDH, MoDHcMcS, MoDHcM), dateTime, FM_YoMoDH, FM_MoDHcMcS, FM_MoDHcM);
                        case SLASH:
                            return matchPattern(YsMsD, dateTime, FM_YsMsD);
                        case DOT:
                            return matchPattern(YoMoD, dateTime, FM_YoMoD);
                        case ZH_TIME_MS:
                            return matchPattern(cs(HzMzSzSz, HoMzSzSz, MzSzSz),  dateTime, FM_HzMzSzSz, FM_HoMzSzSz, FM_MzSzSz);
                        case ZH_ZH:
                            return matchPattern(cs(YzMzDzHz, YzMzDzHo, MzDzHzMzSz, MzDzHoMzSz, MzDzHzMz, MzDzHoMz), dateTime,
                                    FM_YzMzDzHz, FM_YzMzDzHo, FM_MzDzHzMzSz, FM_MzDzHoMzSz, FM_MzDzHzMz, FM_MzDzHoMz);
                        case ZH_DATE:
                            return matchPattern(YzMzDz, dateTime, FM_YzMzDz);
                    }
                    return null;
                }else {
                    return format;
                }

            case 11:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(MdDHcMcSS, dateTime, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(MsDHcMcSS, dateTime, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(MoDHcMcSS, dateTime, FM_MoDHcMcSS);
                    case COLON_DOT:
                        return matchPattern(HcMcSS, dateTime, FM_HcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcM, YsMsDH, MsDHcMcS, MsDHcM), dateTime,
                                FM_YsMsDHcM, FM_YsMsDH, FM_MsDHcMcS, FM_MsDHcM);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcM, YdMdDH, MdDHcMcS, MdDHcM), dateTime,
                                FM_YdMdDHcM, FM_YdMdDH, FM_MdDHcMcS, FM_MdDHcM);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcM, YoMoDH, MoDHcMcS, MoDHcM), dateTime,
                                FM_YoMoDHcM, FM_YoMoDH, FM_MoDHcMcS, FM_MoDHcM);
                    case ZH_TIME_MS:
                        return matchPattern(cs(HzMzSzSz, HoMzSzSz, MzSzSz), dateTime, FM_HzMzSzSz, FM_HoMzSzSz, FM_MzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHz, YzMzDzHo, MzDzHzMzSz, MzDzHoMzSz, MzDzHzMz, MzDzHoMz), dateTime,
                                FM_YzMzDzHz, FM_YzMzDzHo, FM_MzDzHzMzSz, FM_MzDzHoMzSz, FM_MzDzHzMz, FM_MzDzHoMz);
                    case ZH_DATE:
                        return matchPattern(YzMzDz, dateTime, FM_YzMzDz);
                }
                return null;
            case 12:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(YMDHM, dateTime, FM_YMDHM);
                    case DASH_COLON_DOT:
                        return matchPattern(MdDHcMcSS, dateTime, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(MsDHcMcSS, dateTime, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(MoDHcMcSS, dateTime, FM_MoDHcMcSS);
                    case COLON_DOT:
                        return matchPattern(HcMcSS, dateTime, FM_HcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcM, YsMsDH, MsDHcMcS), dateTime, FM_YsMsDHcM, FM_YsMsDH, FM_MsDHcMcS);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcM, YdMdDH, MdDHcMcS), dateTime, FM_YdMdDHcM, FM_YdMdDH, FM_MdDHcMcS);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcM, YoMoDH, MoDHcMcS), dateTime, FM_YoMoDHcM, FM_YoMoDH, FM_MoDHcMcS);
                    case ZH_TIME_MS:
                        return matchPattern(cs(HzMzSzSz, HoMzSzSz),  dateTime, FM_HzMzSzSz, FM_HoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMz, YzMzDzHoMz, YzMzDzHz, YzMzDzHo, MzDzHzMzSz, MzDzHoMzSz, MzDzHzMz, MzDzHoMz), dateTime,
                                FM_YzMzDzHzMz, FM_YzMzDzHoMz, FM_YzMzDzHz, FM_YzMzDzHo, FM_MzDzHzMzSz, FM_MzDzHoMzSz, FM_MzDzHzMz, FM_MzDzHoMz);
                }
                return null;
            case 13:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(MdDHcMcSS, dateTime, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(MsDHcMcSS, dateTime, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(MoDHcMcSS, dateTime, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcMcS, YsMsDHcM, YsMsDH, MsDHcMcS), dateTime,
                                FM_YsMsDHcMcS, FM_YsMsDHcM, FM_YsMsDH, FM_MsDHcMcS);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcMcS, YdMdDHcM, YdMdDH, MdDHcMcS), dateTime,
                                FM_YdMdDHcMcS, FM_YdMdDHcM, FM_YdMdDH, FM_MdDHcMcS);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcMcS, YoMoDHcM, YoMoDH, MoDHcMcS), dateTime,
                                FM_YoMoDHcMcS, FM_YoMoDHcM, FM_YoMoDH, FM_MoDHcMcS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_TIME_MS:
                        return matchPattern(cs(HzMzSzSz, HoMzSzSz),  dateTime, FM_HzMzSzSz, FM_HoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMz, YzMzDzHoMz, YzMzDzHz, YzMzDzHo, MzDzHzMzSz, MzDzHoMzSz), dateTime,
                                FM_YzMzDzHzMz, FM_YzMzDzHoMz, FM_YzMzDzHz, FM_YzMzDzHo, FM_MzDzHzMzSz, FM_MzDzHoMzSz);
                }
                return null;
            case 14:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(YMDHMS, dateTime, FM_YMDHMS);
                    case DASH_COLON_DOT:
                        return matchPattern(MdDHcMcSS, dateTime, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(MsDHcMcSS, dateTime, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(MoDHcMcSS, dateTime, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcMcS, YsMsDHcM, MsDHcMcS), dateTime, FM_YsMsDHcMcS, FM_YsMsDHcM, FM_MsDHcMcS);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcMcS, YdMdDHcM, MdDHcMcS), dateTime, FM_YdMdDHcMcS, FM_YdMdDHcM, FM_MdDHcMcS);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcMcS, YoMoDHcM, MoDHcMcS), dateTime, FM_YoMoDHcMcS, FM_YoMoDHcM, FM_MoDHcMcS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(MzDzHzMzSzSz, MzDzHoMzSzSz), dateTime, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_TIME_MS:
                        return matchPattern(cs(HzMzSzSz, HoMzSzSz), dateTime, FM_HzMzSzSz, FM_HoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz, YzMzDzHzMz, YzMzDzHoMz, YzMzDzHz, YzMzDzHo, MzDzHzMzSz, MzDzHoMzSz), dateTime,
                                FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz, FM_YzMzDzHzMz, FM_YzMzDzHoMz, FM_YzMzDzHz, FM_YzMzDzHo, FM_MzDzHzMzSz, FM_MzDzHoMzSz);
                }
                return null;
            case 15:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(cs(YdMdDHcMcSS, MdDHcMcSS), dateTime, FM_YdMdDHcMcSS, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(cs(YsMsDHcMcSS, MsDHcMcSS), dateTime, FM_YsMsDHcMcSS, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(cs(YoMoDHcMcSS, MoDHcMcSS), dateTime, FM_YoMoDHcMcSS, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcMcS, YsMsDHcM), dateTime, FM_YsMsDHcMcS, FM_YsMsDHcM);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcMcS, YdMdDHcM), dateTime, FM_YdMdDHcMcS, FM_YdMdDHcM);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcMcS, YoMoDHcM), dateTime, FM_YoMoDHcMcS, FM_YoMoDHcM);
                    case ZH_ZH_MS:
                        return matchPattern(cs(MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz, YzMzDzHzMz, YzMzDzHoMz, MzDzHzMzSz, MzDzHoMzSz), dateTime,
                                FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz, FM_YzMzDzHzMz, FM_YzMzDzHoMz, FM_MzDzHzMzSz, FM_MzDzHoMzSz);
                }
                return null;
            case 16:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(cs(YdMdDHcMcSS, MdDHcMcSS), dateTime, FM_YdMdDHcMcSS, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(cs(YsMsDHcMcSS, MsDHcMcSS), dateTime, FM_YsMsDHcMcSS, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(cs(YoMoDHcMcSS, MoDHcMcSS), dateTime, FM_YoMoDHcMcSS, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(cs(YsMsDHcMcS, YsMsDHcM), dateTime, FM_YsMsDHcMcS, FM_YsMsDHcM);
                    case DASH_COLON:
                        return matchPattern(cs(YdMdDHcMcS, YdMdDHcM), dateTime, FM_YdMdDHcMcS, FM_YdMdDHcM);
                    case DOT_COLON:
                        return matchPattern(cs(YoMoDHcMcS, YoMoDHcM), dateTime, FM_YoMoDHcMcS, FM_YoMoDHcM);
                    case ZH_ZH_MS:
                        return matchPattern(cs(MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz, YzMzDzHzMz, YzMzDzHoMz), dateTime,
                                FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz, FM_YzMzDzHzMz, FM_YzMzDzHoMz);
                }
                return null;
            case 17:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case NO_SEPARATOR:
                        return matchPattern(YMDHMSS, dateTime, FM_YMDHMSS);
                    case DASH_COLON_DOT:
                        return matchPattern(cs(YdMdDHcMcSS, MdDHcMcSS), dateTime, FM_YdMdDHcMcSS, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(cs(YsMsDHcMcSS, MsDHcMcSS), dateTime, FM_YsMsDHcMcSS, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(cs(YoMoDHcMcSS, MoDHcMcSS), dateTime, FM_YoMoDHcMcSS, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(YsMsDHcMcS, dateTime, FM_YsMsDHcMcS);
                    case DASH_COLON:
                        return matchPattern(YdMdDHcMcS, dateTime, FM_YdMdDHcMcS);
                    case DOT_COLON:
                        return matchPattern(YoMoDHcMcS, dateTime, FM_YoMoDHcMcS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz, MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime,
                                FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz, YzMzDzHzMz, YzMzDzHoMz), dateTime,
                                FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz, FM_YzMzDzHzMz, FM_YzMzDzHoMz);
                }
                return null;
            case 18:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(cs(YdMdDHcMcSS, MdDHcMcSS), dateTime, FM_YdMdDHcMcSS, FM_MdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(cs(YsMsDHcMcSS, MsDHcMcSS), dateTime, FM_YsMsDHcMcSS, FM_MsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(cs(YoMoDHcMcSS, MoDHcMcSS), dateTime, FM_YoMoDHcMcSS, FM_MoDHcMcSS);
                    case SLASH_COLON:
                        return matchPattern(YsMsDHcMcS, dateTime, FM_YsMsDHcMcS);
                    case DASH_COLON:
                        return matchPattern(YdMdDHcMcS, dateTime, FM_YdMdDHcMcS);
                    case DOT_COLON:
                        return matchPattern(YoMoDHcMcS, dateTime, FM_YoMoDHcMcS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz, MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime,
                                FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz), dateTime, FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz);
                }
                return null;
            case 19:
                // 最常用，先检测
                format = matchPattern(YdMdDHcMcS, dateTime, FM_YdMdDHcMcS);
                if (null == format) {
                    dts = separatorForDate(dateTime);
                    switch (dts) {
                        case DASH_COLON_DOT:
                            return matchPattern(YdMdDHcMcSS, dateTime, FM_YdMdDHcMcSS);
                        case SLASH_COLON_DOT:
                            return matchPattern(YsMsDHcMcSS, dateTime, FM_YsMsDHcMcSS);
                        case DOT_COLON_DOT:
                            return matchPattern(YoMoDHcMcSS, dateTime, FM_YoMoDHcMcSS);
                        case SLASH_COLON:
                            return matchPattern(YsMsDHcMcS, dateTime, FM_YsMsDHcMcS);
                        case DOT_COLON:
                            return matchPattern(YoMoDHcMcS, dateTime, FM_YoMoDHcMcS);
                        case ZH_ZH_MS:
                            return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz, MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime,
                                    FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                        case ZH_ZH:
                            return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz), dateTime, FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz);
                    }
                    return null;
                }else {
                    return format;
                }
            case 20:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(YdMdDHcMcSS, dateTime, FM_YdMdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(YsMsDHcMcSS, dateTime, FM_YsMsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(YoMoDHcMcSS, dateTime, FM_YoMoDHcMcSS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz, MzDzHzMzSzSz, MzDzHoMzSzSz),  dateTime,
                                FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz, FM_MzDzHzMzSzSz, FM_MzDzHoMzSzSz);
                    case ZH_ZH:
                        return matchPattern(cs(YzMzDzHzMzSz, YzMzDzHoMzSz), dateTime, FM_YzMzDzHzMzSz, FM_YzMzDzHoMzSz);
                }
                return null;
            case 21:
            case 22:
            case 23:
                dts = separatorForDate(dateTime);
                switch (dts) {
                    case DASH_COLON_DOT:
                        return matchPattern(YdMdDHcMcSS, dateTime, FM_YdMdDHcMcSS);
                    case SLASH_COLON_DOT:
                        return matchPattern(YsMsDHcMcSS, dateTime, FM_YsMsDHcMcSS);
                    case DOT_COLON_DOT:
                        return matchPattern(YoMoDHcMcSS, dateTime, FM_YoMoDHcMcSS);
                    case ZH_ZH_MS:
                        return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz), dateTime, FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz);
                }
                return null;
            case 24:
            case 25:
                return matchPattern(cs(YzMzDzHzMzSzSz, YzMzDzHoMzSzSz), dateTime, FM_YzMzDzHzMzSzSz, FM_YzMzDzHoMzSzSz);
        }
        return null;
    }

    private static Pattern[] cs(Pattern... compiles) {
        return compiles;
    }

    private static String matchPattern(Pattern[] compiles, String dateTime, String... dateTimeFormats) {
        for (int i = 0; i < compiles.length; i++) {
            boolean isMatch = compiles[i].matcher(dateTime).matches();
            if (isMatch) {
                return dateTimeFormats[i];
            }
        }
        return null;
    }

    private static String matchPattern(Pattern compile, String dateTime, String dateTimeFormat) {
        boolean isMatch = compile.matcher(dateTime).matches();
        return isMatch ? dateTimeFormat : null;
    }

    /**
     * 采用最简单最快速的方法判断时间字符串使用哪一种分隔符。<br>
     * 注意：<br>
     * <b>此函数不做时间串的合法性判断</b>。
     *
     * @param dateTime 时间串
     * @return 时间格式类型
     */
    private static DateTimeSeparator separatorForDate(final String dateTime) {
        if (G.isBlank(dateTime)) return null;
        int length = dateTime.length();
        if (length < 3 || length > 25) return null;

        DateTimeSeparator dts = null;
        switch (length) {
            case 3:
                /*
                 * [M.d, H:m]
                 * -----------------------------------
                 * yyy（三位数的年份）
                 * M-d，M.d，M/d
                 * H:m （省略 m:s，无法与H:m区分）
                 */
                dts = checkSeparator(dateTime);
                return null == dts ? NO_SEPARATOR : dts;
            case 4:
                /*
                 * [M月d日, m分s秒, H时m分]
                 * -----------------------------------
                 * yyyy(忽略MMdd与HHmm，与yyyy冲突)
                 * yyy年 或 M月d日，MM-d，M.dd，M/dd等
                 * HH:m 等 或 H时m分 或 H点m分 或 m分s秒
                 */
                dts = checkSeparator(dateTime);
                return null == dts ? NO_SEPARATOR : dts;
            case 5:
                /*
                 * [m:s.S, H:m:s, M.d H]
                 * -----------------------------------
                 * yyyy年 或 MM月d日 或 M月dd日 或 MM-dd，MM.dd，MM/dd 或 M.d H，yyy-M,yyy/M,yyy.M
                 * HH:mm 或 HH时m分 或 H点mm分 或 mm分s秒等 或 m:s.S 或 H:m:s
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 6:
                /*
                 * [yyyy.M, H时m分s秒, M月d日H时]
                 * -----------------------------------
                 * yyyyMM （HHmmss这种省略，时分秒一般不这样写）
                 * MM月dd日 或 MM.d H 或 yyyy-M,yyyy/M,yyyy.M 或 M月d日H时 或 yyy年M月
                 * HH时mm分 或 HH点mm分 或 mm分ss秒等 或 mm:s.S 或 HH:m:s 等 或 H时m分s秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 7:
                /*
                 * [H:m:s.S, M.d H:m, yyyy年M月, m分s秒S毫秒]
                 * -----------------------------------
                 * MM.dd H 或 yyyy-MM,yyyy/MM,yyyy.MM 或 MM月d日H时 或 M-d H:m, M.d H:m（. 在 : 之前） 日期时间混合 或 yyyy年M月 或 yyy年MM月 或 yyy-M-d, yyy/M/d, yyy.M.d
                 * mm:ss.S（. 在 : 之后） 或 HH:mm:s 等 或 H时mm分s秒 或 H:m:s.S 或 m分s秒S毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 8:
                /*
                 * [yyyy.M.d, M月d日H时m分]
                 * -----------------------------------
                 * yyyyMMdd
                 * MM.dd HH 或 MM月dd日H时 或 MM-d H:m, M.dd H:m（. 在 : 之前） 日期时间混合 或 yyyy年MM月 或 yyyy-M-d, yyyy/M/d, yyyy.M.d 或 M月d日H时m分 或 yyy年M月d日
                 * mm:ss.SS（. 在 : 之后） 或 HH:mm:ss  或 H时mm分ss秒 或 H:m:ss.S 或 m分ss秒S毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 9:
                /*
                 * [M.d H:m:s, yyyy年M月d日, H时m分s秒S毫秒]
                 * -----------------------------------
                 * MM月dd日HH时 或 MM-dd H:m, MM.dd H:m（. 在 : 之前） 日期时间混合 或 yyyy-M-dd, yyyy/M/dd, yyyy.M.dd 或 M月dd日H时m分  或 M.d H:m:s 或 yyyy年M月d日 或 yyy.M.d H
                 * mm:ss.SSS（. 在 : 之后） 或  HH时mm分ss秒 或 H:mm:ss.S 或 mm分ss秒S毫秒 或 H时m分s秒S毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 10:
                /*
                 * [yyyy.M.d H, M月d日H时m分s秒]
                 * -----------------------------------
                 * yyyyMMddHH
                 * MM-dd H:mm, MM.dd H:mm（. 在 : 之前） 日期时间混合 或 yyyy-MM-dd, yyyy/MM/dd, yyyy.MM.dd 或 MM月dd日H时m分
                 * 或 MM.d H:m:s 或 yyyy年MM月d日 或 yyyy.M.d H, M月d日H时m分s秒 或 或 yyy年M月d日H时
                 * H:mm:ss.SS 或 mm分ss秒SS毫秒 或 H时m分s秒SS毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 11:
                /*
                 * [M.d H:m:s.S, yyyy年M月d日H时]
                 * -----------------------------------
                 * MM-dd HH:mm, MM.dd HH:mm（. 在 : 之前） 日期时间混合 或 MM月dd日HH时m分  或 MM.d HH:m:s 或 yyyy年MM月dd日
                 * 或 yyyy.M.dd H, M月dd日H时m分s秒 或 yyyy年M月d日H时  或 yyy.M.d H:m
                 * H:mm:ss.SSS 或 mm分ss秒SSS毫秒 或 H时m分s秒SSS毫秒  或 M.d H:m:s.S
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 12:
                /*
                 * [yyyy.M.d H:m]
                 * -----------------------------------
                 * yyyyMMddHHmm
                 * MM月dd日HH时mm分  或 MM.dd HH:m:s 或 yyyy.MM.dd H, MM月dd日H时m分s秒 或 yyyy年MM月d日H时 或 yyyy.M.d H:m , yyy年M月d日H时m分
                 * HH:mm:ss.SSS  或 HH时m分s秒SSS毫秒  或 MM.d H:m:s.S
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 13:
                /*
                 * [M月d日H时m分s秒S毫秒, yyyy年M月d日H时m分]
                 * -----------------------------------
                 * MM.dd HH:mm:s 或 yyyy.MM.dd HH, MM月dd日HH时m分s秒 或 yyyy年MM月d日HH时 或 yyyy.M.d HH:m 或 M月d日H时m分s秒S毫秒, yyyy年M月d日H时m分 或 yyy.M.d H:m:s
                 * HH时mm分s秒SSS毫秒  或 MM.d H:m:s.SS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 14:
                /*
                 * [yyyy.M.d H:m:s]
                 * -----------------------------------
                 * yyyyMMddHHmmss
                 * MM.dd HH:mm:ss 或 MM月dd日HH时mm分s秒 或 yyyy年MM月dd日HH时 或 yyyy.MM.d HH:m 或 MM月d日H时m分s秒S毫秒, yyyy年MM月d日H时m分 或 yyyy.M.d H:m:s 或 yyy年M月d日H时m分s秒
                 * HH时mm分ss秒SSS毫秒  或 MM.d H:m:s.SSS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 15:
                /*
                 * [yyyy年M月d日H时m分s秒]
                 * -----------------------------------
                 * MM月dd日HH时mm分ss秒  或 yyyy.MM.d HH:mm 或 MM月d日H时m分s秒SS毫秒, yyyy年MM月d日H时mm分 或 yyyy.M.d H:m:ss 或 yyyy年M月d日H时m分s秒 或 yyy.M.d H:m:s.S
                 * MM.d H:m:ss.SSS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 16:
                /*
                 * [yyyy.M.d H:m:s.S]
                 * -----------------------------------
                 * yyyy.MM.dd HH:mm 或 MM月dd日H时m分s秒SS毫秒, yyyy年MM月dd日H时mm分 或 yyyy.M.dd H:m:ss 或 yyyy年M月d日H时m分ss秒 或 yyyy.M.d H:m:s.S
                 * MM.d H:mm:ss.SSS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 17:
                /*
                 * yyyyMMddHHmmssSSS
                 * MM月dd日H时m分s秒SSS毫秒, yyyy年MM月dd日HH时mm分 或 yyyy.M.dd HH:m:ss 或 yyyy年M月d日HH时m分ss秒 或 yyyy.M.d HH:m:s.S 或  yyy年M月d日H时m分s秒S毫秒
                 * MM.d HH:mm:ss.SSS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 18:
                /*
                 * [yyyy年M月d日H时m分s秒S毫秒]
                 * -----------------------------------
                 * MM月dd日HH时m分s秒SSS毫秒 或 yyyy.MM.dd HH:m:ss 或 yyyy年MM月d日HH时m分ss秒 或 yyyy.MM.d HH:m:s.S 或  yyyy年M月d日H时m分s秒S毫秒
                 * MM.dd HH:mm:ss.SSS
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 19:
                /*
                 * MM月dd日HH时mm分s秒SSS毫秒 或 yyyy.MM.dd HH:mm:ss 或 yyyy年MM月d日HH时mm分ss秒 或 yyyy.MM.d HH:mm:s.S 或  yyyy年M月d日H时mm分s秒S毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 20:
                /*
                 * MM月dd日HH时mm分ss秒SSS毫秒  或 yyyy年MM月dd日HH时mm分ss秒 或 yyyy.MM.dd HH:mm:s.S 或  yyyy年M月dd日H时mm分s秒S毫秒
                 */
                dts = checkSeparator(dateTime);
                return checkSeparatorMore(dateTime, dts);
            case 21:
            case 22:
            case 23:
                /*
                 * case 21:  ------------------------
                 * yyyy.MM.dd HH:mm:ss.S 或  yyyy年M月dd日H时mm分ss秒S毫秒
                 * case 22:  ------------------------
                 * yyyy.MM.dd HH:mm:ss.SS 或  yyyy年M月dd日H时mm分ss秒SS毫秒
                 * case 23:  ------------------------
                 * yyyy.MM.dd HH:mm:ss.SSS 或  yyyy年M月dd日H时mm分ss秒SSS毫秒
                 */
                return checkSeparatorFast(dateTime);
            case 24:
            case 25:
                /*
                 * case 24:  ------------------------
                 * yyyy年MM月dd日H时mm分ss秒SSS毫秒
                 * case 25:  ------------------------
                 * yyyy年MM月dd日HH时mm分ss秒SSS毫秒
                 */
                return ZH_ZH_MS;
        }
        return null;
    }

    /**
     * 更进一步检测分隔符类型
     * @param dateTime dateTime
     * @param dts 前面初步检测的分隔符
     * @return 时间串的分隔符类型
     */
    private static DateTimeSeparator checkSeparatorMore(final String dateTime, DateTimeSeparator dts) {
        DateTimeSeparator tmpDts = null;
        switch (dts) {
            case COLON:
                tmpDts = match(dateTime, CONTAIN)
                        .when("-", v -> DASH_COLON)
                        .when("/", v -> SLASH_COLON)
                        .when(".", v -> DOT)     // 先检测 - / 再检测 . ，因为 秒与毫秒可能用 . 分隔
                        .orElse(v -> COLON);
                switch (tmpDts) {
                    case DASH_COLON:
                        return dateTime.contains(".") ? DASH_COLON_DOT : DASH_COLON;
                    case SLASH_COLON:
                        return dateTime.contains(".") ? SLASH_COLON_DOT : SLASH_COLON;
                    case DOT:
                        return getDtsFromColonDotPosition(colonDotPosition(dateTime));
                    default:
                        return COLON;
                }
            case SPACE:
                return match(dateTime, CONTAIN)
                        .when("-", v -> DASH_COLON)
                        .when("/", v -> SLASH_COLON)
                        .when(".", v -> DOT)     // 先检测 - / 再检测 . ，因为 秒与毫秒可能用 . 分隔
                        .orElse(v -> null);
            case ZH_DATE:
                return match()
                        .when(zhTimeMs(dateTime), v -> ZH_ZH_MS)
                        .when(zhTime(dateTime), v -> ZH_ZH)
                        .orElse(v -> ZH_DATE);
        }

        return dts;
    }

    /**
     * 检测分隔符类型
     *
     * @param dateTime 时间串
     * @return 时间串的分隔符类型
     */
    private static DateTimeSeparator checkSeparator(String dateTime) {
        return match(dateTime, CONTAIN)
                .when(":", v -> COLON)
                .when(" ", v -> SPACE)      // 没有检测到冒号，却检测到空格，说明 MM-dd HH 或 MM/dd HH 或 yyyy-MM-dd HH 这种情况
                .when("-", v -> DASH)
                .when("/", v -> SLASH)
                .when(".", v -> DOT)        // 先检测 - / 再检测 . ，因为 秒与毫秒可能用 . 分隔
                .when(zhDate(dateTime), v -> ZH_DATE)
                .when(zhTimeMs(dateTime), v -> ZH_TIME_MS)
                .when(zhTime(dateTime), v -> ZH_TIME)
                .orElse(v -> null);
    }

    /**
     * 针对特定情况的快速检测分隔符类型
     * @param dateTime 时间串
     * @return 时间串的分隔符类型
     */
    private static DateTimeSeparator checkSeparatorFast(String dateTime) {
        return match(dateTime, CONTAIN)
                .when("-", v -> DASH_COLON_DOT)
                .when("/", v -> SLASH_COLON_DOT)
                .when(".", v -> DOT_COLON_DOT)        // 先检测 - / 再检测 . ，因为 秒与毫秒可能用 . 分隔
                .when(zhDate(dateTime), v -> ZH_ZH_MS)
                .orElse(v -> null);
    }

    /**
     * 是否包含中文日期串
     *
     * @param dateTime 时间串
     * @return true or false
     */
    private static boolean zhDate(String dateTime) {
        return dateTime.contains("年") || dateTime.contains("月");
    }

    /**
     * 是否包含中文时间串<br>
     * 包含以下几种情况：
     * H时m分、m分s秒、H时m分s秒
     *
     * @param dateTime 时间串
     * @return true or false
     */
    private static boolean zhTime(String dateTime) {
        return dateTime.contains("时") || dateTime.contains("点") || dateTime.contains("分");
    }

    /**
     * 是否包含毫秒的中文时间串<br>
     * 包含以下几种情况：
     * m分s秒S毫秒、H时m分s秒S毫秒
     *
     * @param dateTime 时间串
     * @return true or false
     */
    private static boolean zhTimeMs(String dateTime) {
        return dateTime.contains("分") && dateTime.contains("毫秒");
    }


    private static DateTimeSeparator getDtsFromColonDotPosition(int position) {
        switch (position) {
            case 0:
                return COLON;
            case 1:
                return DOT_COLON;
            case 2:
                return COLON_DOT;
            case 3:
                return DOT_COLON_DOT;
            default:
                return null;
        }
    }

    /**
     * 冒号（:）与点（.）的位置<br>
     * <ul>
     *     <li> 0：不包含点(.)
     *     <li> 1：点(.)在冒号(:)前
     *     <li> 2：点(.)在冒号(:)后
     *     <li> 3：冒号(:)前后都有点(.)
     *     <li> 4：点(.)在冒号之间（不合法的时间串）
     * </ul>
     *
     * @param dateTimeWithColon 带有冒号的时间串
     * @return 0~4
     */
    private static int colonDotPosition(String dateTimeWithColon) {
        int cIndex = dateTimeWithColon.indexOf(":");
        int cLastIndex = dateTimeWithColon.lastIndexOf(":");
        int dIndex = dateTimeWithColon.indexOf(".");
        int dLastIndex = dateTimeWithColon.lastIndexOf(".");

        if ((dIndex > cIndex && dIndex < cLastIndex) || (dLastIndex > cIndex && dLastIndex < cLastIndex)) return 4;
        if (dIndex > 0 && dIndex < cIndex && dLastIndex > cLastIndex) return 3;
        if (dLastIndex > cLastIndex) return 2;
        if (dIndex > 0 && dIndex < cIndex) return 1;
        return 0;
    }
}
