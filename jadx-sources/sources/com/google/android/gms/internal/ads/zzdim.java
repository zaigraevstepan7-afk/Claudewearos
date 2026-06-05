package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import nc.l2;
import nc.x2;
import q.p0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdim {
    private int zza;
    private l2 zzb;
    private zzbgg zzc;
    private View zzd;
    private List zze;
    private x2 zzg;
    private Bundle zzh;
    private zzcfe zzi;
    private zzcfe zzj;
    private zzcfe zzk;
    private zzecz zzl;
    private mf.a zzm;
    private zzcai zzn;
    private View zzo;
    private View zzp;
    private xd.a zzq;
    private double zzr;
    private zzbgn zzs;
    private zzbgn zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final p0 zzv = new p0(0);
    private final p0 zzw = new p0(0);
    private List zzf = Collections.EMPTY_LIST;

    public static zzdim zzag(zzbpz zzbpzVar) {
        zzdim zzdimVar;
        try {
            zzdil zzdilVarZzak = zzak(zzbpzVar.zzg(), null);
            zzbgg zzbggVarZzh = zzbpzVar.zzh();
            View view = (View) zzam(zzbpzVar.zzj());
            String strZzo = zzbpzVar.zzo();
            List listZzr = zzbpzVar.zzr();
            String strZzm = zzbpzVar.zzm();
            Bundle bundleZzf = zzbpzVar.zzf();
            String strZzn = zzbpzVar.zzn();
            View view2 = (View) zzam(zzbpzVar.zzk());
            xd.a aVarZzl = zzbpzVar.zzl();
            String strZzq = zzbpzVar.zzq();
            String strZzp = zzbpzVar.zzp();
            double dZze = zzbpzVar.zze();
            zzbgn zzbgnVarZzi = zzbpzVar.zzi();
            zzdimVar = null;
            try {
                zzdim zzdimVar2 = new zzdim();
                zzdimVar2.zza = 2;
                zzdimVar2.zzb = zzdilVarZzak;
                zzdimVar2.zzc = zzbggVarZzh;
                zzdimVar2.zzd = view;
                zzdimVar2.zzZ("headline", strZzo);
                zzdimVar2.zze = listZzr;
                zzdimVar2.zzZ("body", strZzm);
                zzdimVar2.zzh = bundleZzf;
                zzdimVar2.zzZ("call_to_action", strZzn);
                zzdimVar2.zzo = view2;
                zzdimVar2.zzq = aVarZzl;
                zzdimVar2.zzZ("store", strZzq);
                zzdimVar2.zzZ("price", strZzp);
                zzdimVar2.zzr = dZze;
                zzdimVar2.zzs = zzbgnVarZzi;
                return zzdimVar2;
            } catch (RemoteException e10) {
                e = e10;
                int i10 = l0.f13401b;
                k.h("Failed to get native ad from app install ad mapper", e);
                return zzdimVar;
            }
        } catch (RemoteException e11) {
            e = e11;
            zzdimVar = null;
        }
    }

    public static zzdim zzah(zzbqa zzbqaVar) {
        try {
            zzdil zzdilVarZzak = zzak(zzbqaVar.zzf(), null);
            zzbgg zzbggVarZzg = zzbqaVar.zzg();
            View view = (View) zzam(zzbqaVar.zzi());
            String strZzo = zzbqaVar.zzo();
            List listZzp = zzbqaVar.zzp();
            String strZzm = zzbqaVar.zzm();
            Bundle bundleZze = zzbqaVar.zze();
            String strZzn = zzbqaVar.zzn();
            View view2 = (View) zzam(zzbqaVar.zzj());
            xd.a aVarZzk = zzbqaVar.zzk();
            String strZzl = zzbqaVar.zzl();
            zzbgn zzbgnVarZzh = zzbqaVar.zzh();
            zzdim zzdimVar = new zzdim();
            zzdimVar.zza = 1;
            zzdimVar.zzb = zzdilVarZzak;
            zzdimVar.zzc = zzbggVarZzg;
            zzdimVar.zzd = view;
            zzdimVar.zzZ("headline", strZzo);
            zzdimVar.zze = listZzp;
            zzdimVar.zzZ("body", strZzm);
            zzdimVar.zzh = bundleZze;
            zzdimVar.zzZ("call_to_action", strZzn);
            zzdimVar.zzo = view2;
            zzdimVar.zzq = aVarZzk;
            zzdimVar.zzZ("advertiser", strZzl);
            zzdimVar.zzt = zzbgnVarZzh;
            return zzdimVar;
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdim zzai(zzbpz zzbpzVar) {
        try {
            return zzal(zzak(zzbpzVar.zzg(), null), zzbpzVar.zzh(), (View) zzam(zzbpzVar.zzj()), zzbpzVar.zzo(), zzbpzVar.zzr(), zzbpzVar.zzm(), zzbpzVar.zzf(), zzbpzVar.zzn(), (View) zzam(zzbpzVar.zzk()), zzbpzVar.zzl(), zzbpzVar.zzq(), zzbpzVar.zzp(), zzbpzVar.zze(), zzbpzVar.zzi(), null, 0.0f);
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdim zzaj(zzbqa zzbqaVar) {
        try {
            return zzal(zzak(zzbqaVar.zzf(), null), zzbqaVar.zzg(), (View) zzam(zzbqaVar.zzi()), zzbqaVar.zzo(), zzbqaVar.zzp(), zzbqaVar.zzm(), zzbqaVar.zze(), zzbqaVar.zzn(), (View) zzam(zzbqaVar.zzj()), zzbqaVar.zzk(), null, null, -1.0d, zzbqaVar.zzh(), zzbqaVar.zzl(), 0.0f);
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdil zzak(l2 l2Var, zzbqd zzbqdVar) {
        if (l2Var == null) {
            return null;
        }
        return new zzdil(l2Var, zzbqdVar);
    }

    private static zzdim zzal(l2 l2Var, zzbgg zzbggVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, xd.a aVar, String str4, String str5, double d10, zzbgn zzbgnVar, String str6, float f10) {
        zzdim zzdimVar = new zzdim();
        zzdimVar.zza = 6;
        zzdimVar.zzb = l2Var;
        zzdimVar.zzc = zzbggVar;
        zzdimVar.zzd = view;
        zzdimVar.zzZ("headline", str);
        zzdimVar.zze = list;
        zzdimVar.zzZ("body", str2);
        zzdimVar.zzh = bundle;
        zzdimVar.zzZ("call_to_action", str3);
        zzdimVar.zzo = view2;
        zzdimVar.zzq = aVar;
        zzdimVar.zzZ("store", str4);
        zzdimVar.zzZ("price", str5);
        zzdimVar.zzr = d10;
        zzdimVar.zzs = zzbgnVar;
        zzdimVar.zzZ("advertiser", str6);
        zzdimVar.zzR(f10);
        return zzdimVar;
    }

    private static Object zzam(xd.a aVar) {
        if (aVar == null) {
            return null;
        }
        return xd.b.u(aVar);
    }

    public static zzdim zzt(zzbqd zzbqdVar) {
        try {
            return zzal(zzak(zzbqdVar.zzj(), zzbqdVar), zzbqdVar.zzk(), (View) zzam(zzbqdVar.zzm()), zzbqdVar.zzs(), zzbqdVar.zzv(), zzbqdVar.zzq(), zzbqdVar.zzi(), zzbqdVar.zzr(), (View) zzam(zzbqdVar.zzn()), zzbqdVar.zzo(), zzbqdVar.zzu(), zzbqdVar.zzt(), zzbqdVar.zze(), zzbqdVar.zzl(), zzbqdVar.zzp(), zzbqdVar.zzf());
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        try {
            zzcfe zzcfeVar = this.zzi;
            if (zzcfeVar != null) {
                zzcfeVar.destroy();
                this.zzi = null;
            }
            zzcfe zzcfeVar2 = this.zzj;
            if (zzcfeVar2 != null) {
                zzcfeVar2.destroy();
                this.zzj = null;
            }
            zzcfe zzcfeVar3 = this.zzk;
            if (zzcfeVar3 != null) {
                zzcfeVar3.destroy();
                this.zzk = null;
            }
            mf.a aVar = this.zzm;
            if (aVar != null) {
                aVar.cancel(false);
                this.zzm = null;
            }
            zzcai zzcaiVar = this.zzn;
            if (zzcaiVar != null) {
                zzcaiVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzJ(zzbgg zzbggVar) {
        this.zzc = zzbggVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(x2 x2Var) {
        this.zzg = x2Var;
    }

    public final synchronized void zzM(zzbgn zzbgnVar) {
        this.zzs = zzbgnVar;
    }

    public final synchronized void zzN(String str, zzbga zzbgaVar) {
        if (zzbgaVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbgaVar);
        }
    }

    public final synchronized void zzO(zzcfe zzcfeVar) {
        this.zzj = zzcfeVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbgn zzbgnVar) {
        this.zzt = zzbgnVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfe zzcfeVar) {
        this.zzk = zzcfeVar;
    }

    public final synchronized void zzU(mf.a aVar) {
        this.zzm = aVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzecz zzeczVar) {
        this.zzl = zzeczVar;
    }

    public final synchronized void zzX(zzcai zzcaiVar) {
        this.zzn = zzcaiVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(l2 l2Var) {
        this.zzb = l2Var;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfe zzcfeVar) {
        this.zzi = zzcfeVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized p0 zzh() {
        return this.zzv;
    }

    public final synchronized p0 zzi() {
        return this.zzw;
    }

    public final synchronized l2 zzj() {
        return this.zzb;
    }

    public final synchronized x2 zzk() {
        return this.zzg;
    }

    public final synchronized zzbgg zzl() {
        return this.zzc;
    }

    public final zzbgn zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbgm.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbgn zzn() {
        return this.zzs;
    }

    public final synchronized zzbgn zzo() {
        return this.zzt;
    }

    public final synchronized zzcai zzp() {
        return this.zzn;
    }

    public final synchronized zzcfe zzq() {
        return this.zzj;
    }

    public final synchronized zzcfe zzr() {
        return this.zzk;
    }

    public final synchronized zzcfe zzs() {
        return this.zzi;
    }

    public final synchronized zzecz zzu() {
        return this.zzl;
    }

    public final synchronized xd.a zzv() {
        return this.zzq;
    }

    public final synchronized mf.a zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
