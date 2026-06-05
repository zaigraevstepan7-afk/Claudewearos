package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import ig.b0;
import ig.d;
import ig.f0;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzyl {
    private final zzadk zza;

    public zzyl(zzadk zzadkVar) {
        e0.i(zzadkVar);
        this.zza = zzadkVar;
    }

    public final void zzb(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        zza(str, new zzaad(this, str2, zzacfVar));
    }

    public final void zzc(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        zza(str, new zzaag(this, str2, zzacfVar));
    }

    public final void zzd(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        this.zza.zza(new zzafw(str, null, str2), new zzyy(this, zzacfVar));
    }

    public final void zze(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        this.zza.zza(new zzaen(str, str2), new zzyw(this, zzacfVar));
    }

    public final void zzf(String str, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zza(str, new zzzh(this, zzacfVar));
    }

    public static void zza(zzyl zzylVar, zzagu zzaguVar, zzacf zzacfVar, zzadn zzadnVar) {
        Status statusT;
        if (zzaguVar.zzo()) {
            f0 f0VarZzb = zzaguVar.zzb();
            String strZzc = zzaguVar.zzc();
            String strZzj = zzaguVar.zzj();
            if (zzaguVar.zzm()) {
                statusT = new Status(17012, null, null, null);
            } else {
                statusT = a.T(zzaguVar.zzd());
            }
            zzacfVar.zza(new zzyj(statusT, f0VarZzb, strZzc, strZzj));
            return;
        }
        zzylVar.zza(new zzafm(zzaguVar.zzi(), zzaguVar.zze(), Long.valueOf(zzaguVar.zza()), "Bearer"), zzaguVar.zzh(), zzaguVar.zzg(), Boolean.valueOf(zzaguVar.zzn()), zzaguVar.zzb(), zzacfVar, zzadnVar);
    }

    public final void zzf(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        zza(str2, new zzzk(this, str, zzacfVar));
    }

    public final void zzb(String str, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        this.zza.zza(new zzafa(str), new zzyo(this, zzacfVar));
    }

    public final void zzc(String str, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zza(str, new zzzw(this, zzacfVar));
    }

    public final void zzd(String str, zzacf zzacfVar) {
        e0.i(zzacfVar);
        this.zza.zza(str, new zzaaa(this, zzacfVar));
    }

    public final void zze(String str, zzacf zzacfVar) {
        e0.i(zzacfVar);
        this.zza.zza(new zzagh(str), new zzaac(this, zzacfVar));
    }

    private final void zzb(zzafh zzafhVar, zzacf zzacfVar) {
        e0.i(zzafhVar);
        e0.i(zzacfVar);
        this.zza.zza(zzafhVar, new zzzz(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        this.zza.zza(new zzagz(str, str2, str3, str4), new zzyq(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        zza(str, new zzzm(this, str2, str3, zzacfVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzagh zzaghVar, zzadn zzadnVar) {
        e0.i(zzacfVar);
        e0.i(zzaghVar);
        e0.i(zzadnVar);
        zzylVar.zza.zza(zzaghVar, new zzze(zzylVar, zzacfVar, zzadnVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzagf zzagfVar, zzadn zzadnVar) {
        e0.i(zzacfVar);
        e0.i(zzafmVar);
        e0.i(zzagfVar);
        e0.i(zzadnVar);
        zzylVar.zza.zza(new zzafd(zzafmVar.zzc()), new zzyr(zzylVar, zzadnVar, zzacfVar, zzafmVar, zzagfVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzaff zzaffVar, zzagf zzagfVar, zzadn zzadnVar) {
        e0.i(zzacfVar);
        e0.i(zzafmVar);
        e0.i(zzaffVar);
        e0.i(zzagfVar);
        e0.i(zzadnVar);
        zzylVar.zza.zza(zzagfVar, new zzyu(zzylVar, zzagfVar, zzaffVar, zzacfVar, zzafmVar, zzadnVar));
    }

    public final void zza(String str, String str2, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zzagf zzagfVar = new zzagf();
        zzagfVar.zze(str);
        zzagfVar.zzh(str2);
        this.zza.zza(zzagfVar, new zzaaf(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        this.zza.zza(new zzafw(str, str2, str3), new zzza(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacfVar);
        this.zza.zza(new zzagh(str, str2, null, str3, str4, null), new zzyn(this, zzacfVar));
    }

    public final void zza(String str, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zza(str, new zzzy(this, zzacfVar));
    }

    private final void zza(String str, zzadm<zzafm> zzadmVar) {
        e0.i(zzadmVar);
        e0.e(str);
        zzafm zzafmVarZzb = zzafm.zzb(str);
        if (zzafmVarZzb.zzg()) {
            zzadmVar.zza((zzadm<zzafm>) zzafmVarZzb);
        } else {
            this.zza.zza(new zzafa(zzafmVarZzb.zzd()), new zzaai(this, zzadmVar));
        }
    }

    public final void zza(zzaeq zzaeqVar, String str, zzacf zzacfVar) {
        e0.i(zzaeqVar);
        e0.i(zzacfVar);
        zza(str, new zzzq(this, zzaeqVar, zzacfVar));
    }

    public final void zza(zzaes zzaesVar, zzacf zzacfVar) {
        e0.i(zzaesVar);
        e0.i(zzacfVar);
        this.zza.zza(zzaesVar, new zzzs(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaeo zzaeoVar, zzacf zzacfVar) {
        e0.i(zzaeoVar);
        e0.i(zzacfVar);
        this.zza.zza(zzaeoVar, new zzys(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafm zzafmVar, String str, String str2, Boolean bool, f0 f0Var, zzacf zzacfVar, zzadn zzadnVar) {
        e0.i(zzafmVar);
        e0.i(zzadnVar);
        e0.i(zzacfVar);
        this.zza.zza(new zzafd(zzafmVar.zzc()), new zzyt(this, zzadnVar, str2, str, bool, f0Var, zzacfVar, zzafmVar));
    }

    public final void zza(zzafj zzafjVar, zzacf zzacfVar) {
        e0.i(zzafjVar);
        e0.i(zzacfVar);
        this.zza.zza(zzafjVar, new zzzt(this, zzacfVar));
    }

    public final void zza(zzafk zzafkVar, zzacf zzacfVar) {
        e0.i(zzafkVar);
        e0.i(zzacfVar);
        this.zza.zza(zzafkVar, new zzzu(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacf zzacfVar) {
        e0.e(str);
        e0.e(str2);
        e0.e(str3);
        e0.i(zzacfVar);
        zza(str3, new zzzb(this, str, str2, str4, str5, zzacfVar));
    }

    public final void zza(String str, zzags zzagsVar, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzagsVar);
        e0.i(zzacfVar);
        zza(str, new zzzf(this, zzagsVar, zzacfVar));
    }

    public final void zza(String str, zzahb zzahbVar, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzahbVar);
        e0.i(zzacfVar);
        zza(str, new zzzd(this, zzahbVar, zzacfVar));
    }

    public final void zza(zzafy zzafyVar, zzacf zzacfVar) {
        this.zza.zza(zzafyVar, new zzaab(this, zzacfVar));
    }

    public final void zza(String str, ig.a aVar, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zzafh zzafhVar = new zzafh(4);
        zzafhVar.zzd(str);
        if (aVar != null) {
            zzafhVar.zza(aVar);
        }
        zzb(zzafhVar, zzacfVar);
    }

    public final void zza(String str, ig.a aVar, String str2, String str3, zzacf zzacfVar) {
        e0.e(str);
        e0.i(zzacfVar);
        zzafh zzafhVar = new zzafh(aVar.B);
        zzafhVar.zzb(str);
        zzafhVar.zza(aVar);
        zzafhVar.zzc(str2);
        zzafhVar.zza(str3);
        this.zza.zza(zzafhVar, new zzyv(this, zzacfVar));
    }

    public final void zza(zzagd zzagdVar, zzacf zzacfVar) {
        e0.e(zzagdVar.zzd());
        e0.i(zzacfVar);
        this.zza.zza(zzagdVar, new zzyz(this, zzacfVar));
    }

    public final void zza(zzags zzagsVar, zzacf zzacfVar) {
        e0.i(zzagsVar);
        e0.i(zzacfVar);
        zzagsVar.zzb(true);
        this.zza.zza(zzagsVar, new zzzo(this, zzacfVar));
    }

    public final void zza(zzagx zzagxVar, zzacf zzacfVar) {
        e0.i(zzagxVar);
        e0.i(zzacfVar);
        this.zza.zza(zzagxVar, new zzyx(this, zzacfVar));
    }

    public final void zza(d dVar, String str, zzacf zzacfVar) {
        e0.i(dVar);
        e0.i(zzacfVar);
        if (dVar.f8533e) {
            zza(dVar.f8532d, new zzyp(this, dVar, str, zzacfVar));
        } else {
            zza(new zzaeo(dVar, null, str), zzacfVar);
        }
    }

    public final void zza(zzahb zzahbVar, zzacf zzacfVar) {
        e0.i(zzahbVar);
        e0.i(zzacfVar);
        this.zza.zza(zzahbVar, new zzzc(this, zzacfVar));
    }

    public final void zza(zzagj zzagjVar, zzacf zzacfVar) {
        e0.i(zzagjVar);
        e0.i(zzacfVar);
        this.zza.zza(zzagjVar, new zzzn(this, zzagjVar, zzacfVar));
    }

    public final void zza(zzagl zzaglVar, zzacf zzacfVar) {
        e0.i(zzaglVar);
        e0.i(zzacfVar);
        this.zza.zza(zzaglVar, new zzzr(this, zzacfVar));
    }

    public final void zza(String str, b0 b0Var, zzacf zzacfVar) {
        e0.e(str);
        e0.i(b0Var);
        e0.i(zzacfVar);
        zza(str, new zzaae(this, b0Var, zzacfVar));
    }

    public final void zza(zzafh zzafhVar, zzacf zzacfVar) {
        zzb(zzafhVar, zzacfVar);
    }
}
