package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import nc.p1;
import nc.s1;
import nc.t;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdkp implements zzdiu, zzdaq {
    private final zzbqd zza;
    private final zzcwj zzb;
    private final zzcyf zzc;
    private final zzcvp zzd;
    private final zzddu zze;
    private final Context zzf;
    private final zzfbt zzg;
    private final rc.a zzh;
    private final zzfco zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbpz zzm;
    private final zzbqa zzn;

    public zzdkp(zzbpz zzbpzVar, zzbqa zzbqaVar, zzbqd zzbqdVar, zzcwj zzcwjVar, zzcyf zzcyfVar, zzcvp zzcvpVar, zzddu zzdduVar, Context context, zzfbt zzfbtVar, rc.a aVar, zzfco zzfcoVar) {
        this.zzm = zzbpzVar;
        this.zzn = zzbqaVar;
        this.zza = zzbqdVar;
        this.zzb = zzcwjVar;
        this.zzc = zzcyfVar;
        this.zzd = zzcvpVar;
        this.zze = zzdduVar;
        this.zzf = context;
        this.zzg = zzfbtVar;
        this.zzh = aVar;
        this.zzi = zzfcoVar;
    }

    private final void zzc(View view) {
        try {
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar != null && !zzbqdVar.zzA()) {
                zzbqdVar.zzw(new xd.b(view));
                this.zzd.onAdClicked();
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
                    this.zze.zzdf();
                    return;
                }
                return;
            }
            zzbpz zzbpzVar = this.zzm;
            if (zzbpzVar != null && !zzbpzVar.zzx()) {
                zzbpzVar.zzs(new xd.b(view));
                this.zzd.onAdClicked();
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
                    this.zze.zzdf();
                    return;
                }
                return;
            }
            zzbqa zzbqaVar = this.zzn;
            if (zzbqaVar == null || zzbqaVar.zzv()) {
                return;
            }
            zzbqaVar.zzq(new xd.b(view));
            this.zzd.onAdClicked();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
                this.zze.zzdf();
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to call handleClick", e10);
        }
    }

    private static final HashMap zzd(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[Catch: RemoteException -> 0x002c, JSONException -> 0x0048, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:13:0x0032, B:15:0x0039, B:16:0x0048, B:18:0x004e, B:20:0x005a, B:23:0x0066, B:26:0x006d, B:28:0x0083, B:30:0x008b, B:45:0x00aa, B:35:0x0095, B:39:0x009e, B:48:0x00b1, B:49:0x00b5, B:51:0x00ce, B:55:0x00e2, B:57:0x00f0, B:58:0x00fe, B:60:0x0102, B:61:0x0113, B:63:0x0117), top: B:70:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzdiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(android.view.View r10, java.util.Map r11, java.util.Map r12, android.view.View.OnTouchListener r13, android.view.View.OnClickListener r14) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkp.zzB(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzC(View view, Map map) {
        try {
            xd.b bVar = new xd.b(view);
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar != null) {
                zzbqdVar.zzz(bVar);
                return;
            }
            zzbpz zzbpzVar = this.zzm;
            if (zzbpzVar != null) {
                zzbpzVar.zzw(bVar);
                return;
            }
            zzbqa zzbqaVar = this.zzn;
            if (zzbqaVar != null) {
                zzbqaVar.zzu(bVar);
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzD() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzE() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzF(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        try {
            zzbqd zzbqdVar = this.zza;
            if (zzbqdVar == null || !zzbqdVar.zzB()) {
                return;
            }
            zzfbt zzfbtVar = this.zzg;
            if (zzfbtVar.zze != 4 && !zzfbtVar.zzaC) {
                return;
            }
            zzbqdVar.zzx();
            this.zzb.zza();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to report impression from an adapter", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzi() {
        int i10 = l0.f13401b;
        k.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzl(s1 s1Var) {
        int i10 = l0.f13401b;
        k.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzm(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzc(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzq(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i10) {
        if (!this.zzk) {
            int i11 = l0.f13401b;
            k.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzc(view2);
        } else {
            int i12 = l0.f13401b;
            k.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = n.D.f11588o.i(this.zzf, this.zzh.f14321a, this.zzg.zzC.toString(), this.zzi.zzf);
            }
            if (this.zzl) {
                zzbqd zzbqdVar = this.zza;
                if (zzbqdVar == null) {
                    zzbpz zzbpzVar = this.zzm;
                    if (zzbpzVar != null && !zzbpzVar.zzy()) {
                        zzbpzVar.zzt();
                        this.zzb.zza();
                        return;
                    }
                    zzbqa zzbqaVar = this.zzn;
                    if (zzbqaVar == null || zzbqaVar.zzw()) {
                        return;
                    }
                    zzbqaVar.zzr();
                    this.zzb.zza();
                    return;
                }
                zzfbt zzfbtVar = this.zzg;
                if (zzfbtVar.zzaC) {
                    if (zzbqdVar.zzB()) {
                        return;
                    }
                    zzbqdVar.zzx();
                    this.zzb.zza();
                    return;
                }
                if (zzbqdVar.zzB() && zzfbtVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbqdVar.zzx();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzy() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzz(p1 p1Var) {
        int i10 = l0.f13401b;
        k.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzA(zzbie zzbieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzo(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzw(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzx(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzv(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
