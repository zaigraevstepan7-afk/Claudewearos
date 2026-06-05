package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfnl extends AsyncTask {
    private zzfnm zza;
    protected final zzfnd zzd;

    public zzfnl(zzfnd zzfndVar) {
        this.zzd = zzfndVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfnm zzfnmVar = this.zza;
        if (zzfnmVar != null) {
            zzfnmVar.zza(this);
        }
    }

    public final void zzb(zzfnm zzfnmVar) {
        this.zza = zzfnmVar;
    }
}
