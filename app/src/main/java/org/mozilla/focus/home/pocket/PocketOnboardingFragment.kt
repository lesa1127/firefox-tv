/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.focus.home.pocket

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import org.mozilla.focus.R

class PocketOnboardingFragment : Fragment() {

    private lateinit var deferredVideos: PocketVideosDeferred

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_pocket_onboarding, container, false)

    companion object {
        const val FRAGMENT_TAG = "pocket_onboarding"

        @JvmStatic
        fun create() = PocketOnboardingFragment()
    }
}
