package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import ed.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final r addWorkAccount(p pVar, String str) {
        return ((j0) pVar).f3557b.doWrite((m) new zzae(this, a.f5920a, pVar, str));
    }

    public final r removeWorkAccount(p pVar, Account account) {
        return ((j0) pVar).f3557b.doWrite((m) new zzag(this, a.f5920a, pVar, account));
    }

    public final void setWorkAuthenticatorEnabled(p pVar, boolean z2) {
        setWorkAuthenticatorEnabledWithResult(pVar, z2);
    }

    public final r setWorkAuthenticatorEnabledWithResult(p pVar, boolean z2) {
        return ((j0) pVar).f3557b.doWrite((m) new zzac(this, a.f5920a, pVar, z2));
    }
}
