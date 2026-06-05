package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import mc.n;
import nc.l2;
import q.p0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdmz extends zzbhg {
    private final Context zza;
    private final zzdim zzb;
    private zzdjm zzc;
    private zzdih zzd;

    public zzdmz(Context context, zzdim zzdimVar, zzdjm zzdjmVar, zzdih zzdihVar) {
        this.zza = context;
        this.zzb = zzdimVar;
        this.zzc = zzdjmVar;
        this.zzd = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final l2 zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgk zzf() {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgn zzg(String str) {
        return (zzbgn) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final xd.a zzh() {
        return new xd.b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final List zzk() {
        try {
            zzdim zzdimVar = this.zzb;
            p0 p0VarZzh = zzdimVar.zzh();
            p0 p0VarZzi = zzdimVar.zzi();
            String[] strArr = new String[p0VarZzh.f13117c + p0VarZzi.f13117c];
            int i10 = 0;
            for (int i11 = 0; i11 < p0VarZzh.f13117c; i11++) {
                strArr[i10] = (String) p0VarZzh.f(i11);
                i10++;
            }
            for (int i12 = 0; i12 < p0VarZzi.f13117c; i12++) {
                strArr[i10] = (String) p0VarZzi.f(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzl() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                int i10 = l0.f13401b;
                k.g("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzC)) {
                int i11 = l0.f13401b;
                k.g("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdih zzdihVar = this.zzd;
                if (zzdihVar != null) {
                    zzdihVar.zzf(strZzC, false);
                }
            }
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzn(String str) {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzo() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzp(xd.a aVar) throws SecurityException {
        zzdih zzdihVar;
        Object objU = xd.b.u(aVar);
        if (!(objU instanceof View) || this.zzb.zzu() == null || (zzdihVar = this.zzd) == null) {
            return;
        }
        zzdihVar.zzK((View) objU);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzq() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null && !zzdihVar.zzX()) {
            return false;
        }
        zzdim zzdimVar = this.zzb;
        return zzdimVar.zzr() != null && zzdimVar.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzr(xd.a aVar) throws SecurityException {
        zzdjm zzdjmVar;
        Object objU = xd.b.u(aVar);
        if (!(objU instanceof ViewGroup) || (zzdjmVar = this.zzc) == null || !zzdjmVar.zzf((ViewGroup) objU)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdmy(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzs(xd.a aVar) throws SecurityException {
        zzdjm zzdjmVar;
        Object objU = xd.b.u(aVar);
        if (!(objU instanceof ViewGroup) || (zzdjmVar = this.zzc) == null || !zzdjmVar.zzg((ViewGroup) objU)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdmy(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzt() {
        zzdim zzdimVar = this.zzb;
        zzecz zzeczVarZzu = zzdimVar.zzu();
        if (zzeczVarZzu == null) {
            int i10 = l0.f13401b;
            k.g("Trying to start OMID session before creation.");
            return false;
        }
        n.D.f11598y.zzk(zzeczVarZzu.zza());
        if (zzdimVar.zzr() == null) {
            return true;
        }
        zzdimVar.zzr().zzd("onSdkLoaded", new q.e(0));
        return true;
    }
}
