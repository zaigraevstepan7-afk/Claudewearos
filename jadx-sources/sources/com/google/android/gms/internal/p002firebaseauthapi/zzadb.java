package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import ig.c;
import ig.r;
import jg.h;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzadb implements zzacg {
    final /* synthetic */ zzacz zza;

    public zzadb(zzacz zzaczVar) {
        this.zza = zzaczVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(Status status) {
        String str = status.f3492b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzacz zzaczVar = this.zza;
        if (zzaczVar.zza != 8) {
            zzacz.zza(zzaczVar, status);
            this.zza.zza(status);
        } else {
            zzaczVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadf(this, status));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 8);
        this.zza.zzo = str;
        zza(new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 7);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzn = str;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zzb() {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 6);
        zzacz.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zzc() {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 9);
        zzacz.zza(this.zza);
    }

    private final void zza(zzadh zzadhVar) {
        this.zza.zzi.execute(new zzade(this, zzadhVar));
    }

    private final void zza(Status status, c cVar, String str, String str2) {
        zzacz.zza(this.zza, status);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzp = cVar;
        zzaczVar.zzq = str;
        zzaczVar.zzr = str2;
        h hVar = zzaczVar.zzf;
        if (hVar != null) {
            hVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(String str) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 8);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzo = str;
        zzaczVar.zzz = true;
        this.zza.zzx = true;
        zza(new zzadc(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzaem zzaemVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 3);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzl = zzaemVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza() {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 5);
        zzacz.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzyj zzyjVar) {
        zza(zzyjVar.zza(), zzyjVar.zzb(), zzyjVar.zzc(), zzyjVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzym zzymVar) {
        zzacz zzaczVar = this.zza;
        zzaczVar.zzs = zzymVar;
        zzaczVar.zza(a.T("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(Status status, r rVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 2);
        zza(status, rVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzafi zzafiVar) {
        zzacz zzaczVar = this.zza;
        zzaczVar.zzu = zzafiVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzafn zzafnVar) {
        zzacz zzaczVar = this.zza;
        zzaczVar.zzt = zzafnVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzafm zzafmVar, zzaff zzaffVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type: " + i10, i10 == 2);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzj = zzafmVar;
        zzaczVar.zzk = zzaffVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzafz zzafzVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 4);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzm = zzafzVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzaga zzagaVar) {
        zzacz zzaczVar = this.zza;
        zzaczVar.zzw = zzagaVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzagi zzagiVar) {
        zzacz zzaczVar = this.zza;
        zzaczVar.zzv = zzagiVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(zzafm zzafmVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type: " + i10, i10 == 1);
        zzacz zzaczVar = this.zza;
        zzaczVar.zzj = zzafmVar;
        zzacz.zza(zzaczVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacg
    public final void zza(r rVar) {
        int i10 = this.zza.zza;
        e0.k("Unexpected response type " + i10, i10 == 8);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza(new zzadd(this, rVar));
    }
}
