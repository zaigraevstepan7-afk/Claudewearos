package com.anonlab.voidlauncher;

import android.content.Intent;
import android.os.Bundle;
import c.p;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import d.g;
import w5.w;
import x9.b;
import y8.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class MainActivity extends w {
    @Override // w5.w, c.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a(this, b.f(0, 0), b.f(0, 0));
        if (!getSharedPreferences("void_launcher_prefs", 0).getBoolean("setup_complete", false)) {
            Intent intent = new Intent(this, (Class<?>) SetupActivity.class);
            intent.addFlags(268468224);
            startActivity(intent);
            finish();
            return;
        }
        Intent intent2 = new Intent(this, (Class<?>) HomeActivity.class);
        intent2.addFlags(268468224);
        startActivity(intent2);
        finish();
        g.a(this, a.f20237b);
    }
}
