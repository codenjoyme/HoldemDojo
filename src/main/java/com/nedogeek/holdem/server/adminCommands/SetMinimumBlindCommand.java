package com.nedogeek.holdem.server.adminCommands;

import com.nedogeek.holdem.server.AdminModel;

/**
 * User: Konstantin Demishev
 * Date: 19.04.13
 * Time: 4:15
 */
public class SetMinimumBlindCommand implements AdminCommand{
    @Override
    public void invoke(String[] params, AdminModel adminModel) {
        int MinimumBlind = Integer.parseInt(params[0]);

        adminModel.setMinimumBlind(MinimumBlind);
    }
}
