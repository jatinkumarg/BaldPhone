/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.bald.uriah.baldphone.fragments_and_dialogs.tutorial_fragments;

import android.content.Context;

import com.bald.uriah.baldphone.R;
import com.bald.uriah.baldphone.activities.FakeLauncherActivity;
import com.bald.uriah.baldphone.utils.BPrefs;
import com.bald.uriah.baldphone.views.BaldButton;

public class TutorialFragment4 extends TutorialFragment {
    BaldButton bt_home;


    @Override
    protected void attachXml() {
        bt_home = root.findViewById(R.id.bt_home);
    }

    @Override
    protected void actualSetup() {
        bt_home.setOnClickListener(v -> {
            FakeLauncherActivity.resetPreferredLauncherAndOpenChooser(v.getContext());
            v.getContext().getSharedPreferences(BPrefs.KEY, Context.MODE_PRIVATE).edit().putBoolean(BPrefs.AFTER_TUTORIAL_KEY, true).apply();
        });
    }

    @Override
    protected int layoutRes() {
        return R.layout.tutorial_fragment_4;
    }
}
