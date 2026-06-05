package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import fc.v;
import nc.l2;
import nc.n2;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdob extends v {
    private final zzdim zza;

    public zzdob(zzdim zzdimVar) {
        this.zza = zzdimVar;
    }

    private static n2 zza(zzdim zzdimVar) {
        l2 l2VarZzj = zzdimVar.zzj();
        if (l2VarZzj == null) {
            return null;
        }
        try {
            return l2VarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // fc.v
    public final void onVideoEnd() {
        n2 n2VarZza = zza(this.zza);
        if (n2VarZza == null) {
            return;
        }
        try {
            n2VarZza.zze();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // fc.v
    public final void onVideoPause() {
        n2 n2VarZza = zza(this.zza);
        if (n2VarZza == null) {
            return;
        }
        try {
            n2VarZza.zzg();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // fc.v
    public final void onVideoStart() {
        n2 n2VarZza = zza(this.zza);
        if (n2VarZza == null) {
            return;
        }
        try {
            n2VarZza.zzi();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Unable to call onVideoEnd()", e10);
        }
    }
}
