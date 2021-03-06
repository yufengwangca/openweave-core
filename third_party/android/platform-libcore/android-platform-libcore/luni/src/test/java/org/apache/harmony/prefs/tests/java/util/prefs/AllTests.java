/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.harmony.prefs.tests.java.util.prefs;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Suite for package org.apache.harmony.prefs.tests.java.util.prefs
 *
 */
public class AllTests {
    public static Test suite() {
        TestSuite suite = new TestSuite("Suite for org.apache.harmony.prefs.tests.java.util.prefs");
        // $JUnit-BEGIN$
        suite.addTestSuite(NodeChangeListenerTest.class);
        suite.addTestSuite(PreferenceChangeListenerTest.class);
        suite.addTestSuite(PreferencesFactoryTest.class);
        suite.addTestSuite(BackingStoreExceptionTest.class);
        suite.addTestSuite(InvalidPreferencesFormatExceptionTest.class);
        suite.addTestSuite(PreferenceChangeEventTest.class);
        suite.addTestSuite(NodeChangeEventTest.class);
        suite.addTestSuite(PreferencesTest.class);
        suite.addTestSuite(AbstractPreferencesTest.class);
        suite.addTestSuite(FilePreferencesImplTest.class);
        // $JUnit-END$
        return suite;
    }
}
