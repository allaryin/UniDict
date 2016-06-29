package wanion.unidict.tweak;

/*
 * Created by WanionCane(https://github.com/WanionCane).
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 1.1. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/1.1/.
 */

import wanion.unidict.AbstractModule;

public final class TweakModule extends AbstractModule
{
    public TweakModule()
    {
        super("Tweak");
    }

    @Override
    protected void init()
    {
        //if (Config.exNihiloTweak)
        //    add(new ExNihiloTweak());
    }
}