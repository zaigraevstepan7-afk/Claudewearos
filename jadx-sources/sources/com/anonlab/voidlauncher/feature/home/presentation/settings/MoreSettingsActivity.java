package com.anonlab.voidlauncher.feature.home.presentation.settings;

import android.os.Bundle;
import c.m;
import c.p;
import java.util.Iterator;
import lb.g;
import lb.r3;
import lb.t0;
import p1.e;
import x9.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class MoreSettingsActivity extends m {
    public static final /* synthetic */ int M = 0;

    @Override // c.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r3 r3Var;
        Object next;
        super.onCreate(bundle);
        p.a(this, b.f(0, 0), b.f(p.f1853a, p.f1854b));
        g gVar = new g(this);
        String stringExtra = getIntent().getStringExtra("extra_screen");
        if (stringExtra != null) {
            r3.f10627b.getClass();
            Iterator it = r3.E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((r3) next).f10633a.equals(stringExtra)) {
                        break;
                    }
                }
            }
            r3Var = (r3) next;
            if (r3Var == null) {
                r3Var = r3.f10628c;
            }
        } else {
            r3Var = r3.f10628c;
        }
        d.g.a(this, new e(new t0(gVar, this, r3Var, 0), true, 1696080282));
    }
}
