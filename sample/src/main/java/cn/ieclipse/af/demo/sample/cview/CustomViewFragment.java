/*
 * Copyright 2014-2015 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.af.demo.sample.cview;

import cn.ieclipse.af.demo.sample.ButtonListFragment;
import cn.ieclipse.af.demo.sample.cview.expendview.ExpendViewActivity;
import cn.ieclipse.af.demo.sample.recycler.sort.SortListViewActivity;

/**
 * 类/接口描述
 *
 * @author Jamling
 * @date 2015年11月12日
 */
public class CustomViewFragment extends ButtonListFragment {

    @Override
    protected CharSequence getTitle() {
        return "Custom Views";
    }

    @Override
    protected Class[] getActivities() {
        return new Class[]{FlowLayoutActivity.class, TableLayoutActivity.class, TitleBarActivity.class,
            RoundButtonActivity.class, ColumnLayoutActivity.class, PreferenceActivity.class,
            StaggeredGridViewActivity.class, AutoPlayViewActivity.class, RadioButtonBadgeViewActivity.class,
            AutoHeightViewPagerActivity.class, CheckableLayoutActivity.class, ExpendViewActivity.class,
            WheelViewActivity.class, PercentLayoutActivity.class, SortListViewActivity.class, FlexboxLayoutActivity
            .class, SimpleMonthPickerActivity.class};
    }
}
