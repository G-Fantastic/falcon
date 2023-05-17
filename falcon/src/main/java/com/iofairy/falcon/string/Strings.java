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
package com.iofairy.falcon.string;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * String utils
 */
public class Strings {
    /**
     * 将二维字节数组转成字符串
     *
     * @param byteArrays 二维字节数组
     * @param charset    字符编码
     * @return 字符串
     * @since 0.4.2
     */
    public static String toString(byte[][] byteArrays, Charset charset) {
        StringBuilder sb = new StringBuilder();
        for (byte[] bytes : byteArrays) {
            sb.append(new String(bytes, charset));
        }
        return sb.toString();
    }

    /**
     * 将二维字节数组转成字符串
     *
     * @param byteArrays 二维字节数组
     * @return 字符串
     * @since 0.4.2
     */
    public static String toString(byte[][] byteArrays) {
        return toString(byteArrays, StandardCharsets.UTF_8);
    }

}
