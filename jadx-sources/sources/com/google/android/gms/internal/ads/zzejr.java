package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.e0;
import java.util.Collections;
import mc.n;
import nc.a2;
import nc.b1;
import nc.c0;
import nc.e1;
import nc.g1;
import nc.i2;
import nc.l0;
import nc.l2;
import nc.n3;
import nc.o2;
import nc.q0;
import nc.q3;
import nc.s3;
import nc.t;
import nc.v3;
import nc.w;
import nc.z;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejr extends l0 {
    private final Context zza;
    private final z zzb;
    private final zzfco zzc;
    private final zzcon zzd;
    private final ViewGroup zze;
    private final zzdsc zzf;

    public zzejr(Context context, z zVar, zzfco zzfcoVar, zzcon zzconVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zVar;
        this.zzc = zzfcoVar;
        this.zzd = zzconVar;
        this.zzf = zzdscVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzd = zzconVar.zzd();
        r0 r0Var = n.D.f11577c;
        frameLayout.addView(viewZzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f12222c);
        frameLayout.setMinimumWidth(zzg().f12225f);
        this.zze = frameLayout;
    }

    @Override // nc.m0
    public final void zzA() {
        this.zzd.zzh();
    }

    @Override // nc.m0
    public final void zzB() {
        e0.d("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // nc.m0
    public final void zzC(w wVar) {
        int i10 = qc.l0.f13401b;
        k.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final void zzD(z zVar) {
        int i10 = qc.l0.f13401b;
        k.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final void zzE(q0 q0Var) {
        int i10 = qc.l0.f13401b;
        k.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final void zzF(s3 s3Var) {
        e0.d("setAdSize must be called on the main UI thread.");
        zzcon zzconVar = this.zzd;
        if (zzconVar != null) {
            zzconVar.zzi(this.zze, s3Var);
        }
    }

    @Override // nc.m0
    public final void zzG(b1 b1Var) {
        zzekq zzekqVar = this.zzc.zzc;
        if (zzekqVar != null) {
            zzekqVar.zzm(b1Var);
        }
    }

    @Override // nc.m0
    public final void zzN(boolean z2) {
        int i10 = qc.l0.f13401b;
        k.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final void zzO(zzbdx zzbdxVar) {
        int i10 = qc.l0.f13401b;
        k.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final void zzP(a2 a2Var) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlN)).booleanValue()) {
            int i10 = qc.l0.f13401b;
            k.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzekq zzekqVar = this.zzc.zzc;
        if (zzekqVar != null) {
            try {
                if (!a2Var.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e10) {
                int i11 = qc.l0.f13401b;
                k.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            zzekqVar.zzl(a2Var);
        }
    }

    @Override // nc.m0
    public final void zzU(n3 n3Var) {
        int i10 = qc.l0.f13401b;
        k.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final boolean zzY() {
        zzcon zzconVar = this.zzd;
        return zzconVar != null && zzconVar.zzr();
    }

    @Override // nc.m0
    public final boolean zzZ() {
        return false;
    }

    @Override // nc.m0
    public final boolean zzaa() {
        return false;
    }

    @Override // nc.m0
    public final boolean zzab(q3 q3Var) {
        int i10 = qc.l0.f13401b;
        k.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // nc.m0
    public final void zzac(e1 e1Var) {
        int i10 = qc.l0.f13401b;
        k.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // nc.m0
    public final Bundle zzd() {
        int i10 = qc.l0.f13401b;
        k.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // nc.m0
    public final s3 zzg() {
        e0.d("getAdSize must be called on the main UI thread.");
        return zzfcu.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // nc.m0
    public final z zzi() {
        return this.zzb;
    }

    @Override // nc.m0
    public final b1 zzj() {
        return this.zzc.zzn;
    }

    @Override // nc.m0
    public final i2 zzk() {
        return this.zzd.zzl();
    }

    @Override // nc.m0
    public final l2 zzl() {
        return this.zzd.zze();
    }

    @Override // nc.m0
    public final xd.a zzn() {
        return new xd.b(this.zze);
    }

    @Override // nc.m0
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override // nc.m0
    public final String zzs() {
        zzcon zzconVar = this.zzd;
        if (zzconVar.zzl() != null) {
            return zzconVar.zzl().zzg();
        }
        return null;
    }

    @Override // nc.m0
    public final String zzt() {
        zzcon zzconVar = this.zzd;
        if (zzconVar.zzl() != null) {
            return zzconVar.zzl().zzg();
        }
        return null;
    }

    @Override // nc.m0
    public final void zzx() {
        e0.d("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // nc.m0
    public final void zzz() {
        e0.d("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }

    @Override // nc.m0
    public final void zzX() {
    }

    @Override // nc.m0
    public final void zzH(zzbax zzbaxVar) {
    }

    @Override // nc.m0
    public final void zzI(v3 v3Var) {
    }

    @Override // nc.m0
    public final void zzJ(g1 g1Var) {
    }

    @Override // nc.m0
    public final void zzK(o2 o2Var) {
    }

    @Override // nc.m0
    public final void zzL(boolean z2) {
    }

    @Override // nc.m0
    public final void zzM(zzbtx zzbtxVar) {
    }

    @Override // nc.m0
    public final void zzR(String str) {
    }

    @Override // nc.m0
    public final void zzS(zzbwg zzbwgVar) {
    }

    @Override // nc.m0
    public final void zzT(String str) {
    }

    @Override // nc.m0
    public final void zzW(xd.a aVar) {
    }

    @Override // nc.m0
    public final void zzQ(zzbua zzbuaVar, String str) {
    }

    @Override // nc.m0
    public final void zzy(q3 q3Var, c0 c0Var) {
    }
}
