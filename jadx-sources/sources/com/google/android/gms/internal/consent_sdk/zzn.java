package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import lf.a;
import lf.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcj zzc(Activity activity, g gVar) {
        gVar.getClass();
        mh.g gVar2 = new mh.g(this.zza, 20);
        boolean z2 = true;
        if (!zzcu.zza(true) && !((ArrayList) gVar2.f11707b).contains(zzcm.zza((Context) gVar2.f11708c))) {
            z2 = false;
        }
        return zzp.zza(new zzp(this, activity, new a(z2, gVar2), gVar, null));
    }
}
