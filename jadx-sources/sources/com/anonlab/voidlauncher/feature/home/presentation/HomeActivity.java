package com.anonlab.voidlauncher.feature.home.presentation;

import ac.h;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import c.m;
import c.p;
import cg.i;
import l7.n;
import la.a;
import lb.g;
import mg.f;
import nb.o;
import p1.e;
import tj.i0;
import tj.r0;
import x9.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class HomeActivity extends m {
    public static final /* synthetic */ int N = 0;
    public final r0 M = i0.b(Boolean.FALSE);

    @Override // c.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        p.a(this, b.f(0, 0), b.f(p.f1853a, p.f1854b));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        int i11 = 0;
        if (i10 < 35) {
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
        }
        o oVar = o.f12026a;
        String string2 = getSharedPreferences("void_dev_prefs", 0).getString("dev_bound_uid", null);
        if (string2 != null && (string = getSharedPreferences("void_dev_prefs", 0).getString("dev_email", null)) != null) {
            r0 r0Var = o.f12048x;
            nb.b bVar = new nb.b(string2, string);
            r0Var.getClass();
            r0Var.k(null, bVar);
            int i12 = 18;
            o.f12029d.e("users/" + string2 + "/isPro").c().addOnSuccessListener(new h(new a(i12), i12)).addOnFailureListener(new n(11));
        }
        g gVar = new g(this);
        SharedPreferences sharedPreferences = getSharedPreferences("void_launcher_prefs", 0);
        sharedPreferences.getBoolean("dev_unlocked", false);
        f.c(i.e(), "https://voidlauncher2anonlab-default-rtdb.europe-west1.firebasedatabase.app").d().b("config/releaseTimestamp").a(new ag.i(this, 19));
        d.g.a(this, new e(new ra.f(this, gVar, sharedPreferences, i11), true, -1039999599));
    }
}
