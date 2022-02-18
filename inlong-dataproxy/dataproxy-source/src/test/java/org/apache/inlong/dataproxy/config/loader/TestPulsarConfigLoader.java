/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.dataproxy.config.loader;

import org.apache.inlong.dataproxy.config.ConfigManager;
import org.junit.Test;

import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class TestPulsarConfigLoader {

    @Test
    public void testResult() {
        Map<String, String> url2token = ConfigManager.getInstance().getPulsarUrl2Token();
        assertEquals("pulsartoken1", url2token.get("pulsar1://127.0.0.1:6650"));
        assertEquals("pulsartoken2", url2token.get("pulsar2://127.0.0.1:6680"));

    }
}
