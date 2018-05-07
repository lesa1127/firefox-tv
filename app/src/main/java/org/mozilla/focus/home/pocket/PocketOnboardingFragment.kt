/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.focus.home.pocket

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pocket_onboarding.*
import org.mozilla.focus.R
import org.mozilla.focus.ScreenController

class PocketOnboardingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_pocket_onboarding, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        pocket_onboarding_button.setOnClickListener {
            ScreenController.showPocketScreen(fragmentManager)
        }

        titleText.text = resources.getString(R.string.pocket_home_tutorial_title, resources.getString(R.string.pocket_brand_name))
        descriptionText.text = resources.getString(R.string.pocket_home_tutorial_title, resources.getString(R.string.pocket_brand_name))
    }



    companion object {
        const val FRAGMENT_TAG = "pocket_onboarding"

        @JvmStatic
        fun create() = PocketOnboardingFragment()
    }
}
