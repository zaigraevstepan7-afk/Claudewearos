package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcmb implements zzcwm {
    private final zzfdm zza;

    public zzcmb(zzfdm zzfdmVar) {
        this.zza = zzfdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcv e10) {
            int i10 = l0.f13401b;
            k.h("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfcv e10) {
            int i10 = l0.f13401b;
            k.h("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
        try {
            zzfdm zzfdmVar = this.zza;
            zzfdmVar.zzu();
            if (context != null) {
                zzfdmVar.zzs(context);
            }
        } catch (zzfcv e10) {
            int i10 = l0.f13401b;
            k.h("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
