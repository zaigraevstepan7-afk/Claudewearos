package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import cg.i;
import com.google.android.gms.common.internal.e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzacw extends zzadk implements zzaee {
    private zzacq zza;
    private zzacp zzb;
    private zzadt zzc;
    private final zzact zzd;
    private final i zze;
    private String zzf;
    private zzacv zzg;

    public zzacw(i iVar, zzact zzactVar) {
        this(iVar, zzactVar, null, null, null);
    }

    private final zzacv zzb() {
        if (this.zzg == null) {
            this.zzg = new zzacv(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaen zzaenVar, zzadm<zzaem> zzadmVar) throws IOException {
        e0.i(zzaenVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/createAuthUri", this.zzf), zzaenVar, zzadmVar, zzaem.class, zzacqVar.zza);
    }

    private zzacw(i iVar, zzact zzactVar, zzadt zzadtVar, zzacq zzacqVar, zzacp zzacpVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze = iVar;
        iVar.b();
        this.zzf = iVar.f3369c.f3381a;
        e0.i(zzactVar);
        this.zzd = zzactVar;
        zza(null, null, null);
        zzaec.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaep zzaepVar, zzadm<Void> zzadmVar) throws IOException {
        e0.i(zzaepVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/deleteAccount", this.zzf), zzaepVar, zzadmVar, Void.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaeo zzaeoVar, zzadm<zzaer> zzadmVar) throws IOException {
        e0.i(zzaeoVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/emailLinkSignin", this.zzf), zzaeoVar, zzadmVar, zzaer.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaeq zzaeqVar, zzadm<zzaet> zzadmVar) throws IOException {
        e0.i(zzaeqVar);
        e0.i(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaeqVar, zzadmVar, zzaet.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaes zzaesVar, zzadm<zzaev> zzadmVar) throws IOException {
        e0.i(zzaesVar);
        e0.i(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaesVar, zzadmVar, zzaev.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafa zzafaVar, zzadm<zzafm> zzadmVar) throws IOException {
        e0.i(zzafaVar);
        e0.i(zzadmVar);
        zzadt zzadtVar = this.zzc;
        zzadp.zza(zzadtVar.zza("/token", this.zzf), zzafaVar, zzadmVar, zzafm.class, zzadtVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafd zzafdVar, zzadm<zzafc> zzadmVar) throws IOException {
        e0.i(zzafdVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/getAccountInfo", this.zzf), zzafdVar, zzadmVar, zzafc.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafh zzafhVar, zzadm<zzafg> zzadmVar) throws IOException {
        e0.i(zzafhVar);
        e0.i(zzadmVar);
        if (zzafhVar.zzb() != null) {
            zzb().zzb(zzafhVar.zzb().A);
        }
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/getOobConfirmationCode", this.zzf), zzafhVar, zzadmVar, zzafg.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafj zzafjVar, zzadm<zzafi> zzadmVar) {
        e0.i(zzafjVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/getRecaptchaParam", this.zzf), zzadmVar, zzafi.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafk zzafkVar, zzadm<zzafn> zzadmVar) {
        e0.i(zzafkVar);
        e0.i(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzafkVar.zzb() + "&version=" + zzafkVar.zzc(), zzadmVar, zzafn.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaee
    public final void zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafw zzafwVar, zzadm<zzafz> zzadmVar) throws IOException {
        e0.i(zzafwVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/resetPassword", this.zzf), zzafwVar, zzadmVar, zzafz.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafy zzafyVar, zzadm<zzaga> zzadmVar) throws IOException {
        e0.i(zzafyVar);
        e0.i(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts:revokeToken", this.zzf), zzafyVar, zzadmVar, zzaga.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagd zzagdVar, zzadm<zzagc> zzadmVar) throws IOException {
        e0.i(zzagdVar);
        e0.i(zzadmVar);
        if (!TextUtils.isEmpty(zzagdVar.zzc())) {
            zzb().zzb(zzagdVar.zzc());
        }
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/sendVerificationCode", this.zzf), zzagdVar, zzadmVar, zzagc.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagf zzagfVar, zzadm<zzage> zzadmVar) throws IOException {
        e0.i(zzagfVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/setAccountInfo", this.zzf), zzagfVar, zzadmVar, zzage.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(String str, zzadm<Void> zzadmVar) {
        e0.i(zzadmVar);
        zzb().zza(str);
        zzadmVar.zza((zzadm<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagh zzaghVar, zzadm<zzagg> zzadmVar) throws IOException {
        e0.i(zzaghVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/signupNewUser", this.zzf), zzaghVar, zzadmVar, zzagg.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagj zzagjVar, zzadm<zzagi> zzadmVar) throws IOException {
        e0.i(zzagjVar);
        e0.i(zzadmVar);
        if (zzagjVar instanceof zzagn) {
            zzagn zzagnVar = (zzagn) zzagjVar;
            if (!TextUtils.isEmpty(zzagnVar.zzb())) {
                zzb().zzb(zzagnVar.zzb());
            }
        }
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzagjVar, zzadmVar, zzagi.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagl zzaglVar, zzadm<zzagk> zzadmVar) throws IOException {
        e0.i(zzaglVar);
        e0.i(zzadmVar);
        if (!TextUtils.isEmpty(zzaglVar.zzb())) {
            zzb().zzb(zzaglVar.zzb());
        }
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaglVar, zzadmVar, zzagk.class, zzacpVar.zza);
    }

    private final void zza(zzadt zzadtVar, zzacq zzacqVar, zzacp zzacpVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzaed.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzaec.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strZza);
        }
        if (this.zzc == null) {
            this.zzc = new zzadt(strZza, zzb());
        }
        String strZza2 = zzaed.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzaec.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strZza2);
        }
        if (this.zza == null) {
            this.zza = new zzacq(strZza2, zzb());
        }
        String strZza3 = zzaed.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzaec.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strZza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzacp(strZza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzags zzagsVar, zzadm<zzagu> zzadmVar) throws IOException {
        e0.i(zzagsVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/verifyAssertion", this.zzf), zzagsVar, zzadmVar, zzagu.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagx zzagxVar, zzadm<zzagw> zzadmVar) throws IOException {
        e0.i(zzagxVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/verifyCustomToken", this.zzf), zzagxVar, zzadmVar, zzagw.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagz zzagzVar, zzadm<zzagy> zzadmVar) throws IOException {
        e0.i(zzagzVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/verifyPassword", this.zzf), zzagzVar, zzadmVar, zzagy.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzahb zzahbVar, zzadm<zzaha> zzadmVar) throws IOException {
        e0.i(zzahbVar);
        e0.i(zzadmVar);
        zzacq zzacqVar = this.zza;
        zzadp.zza(zzacqVar.zza("/verifyPhoneNumber", this.zzf), zzahbVar, zzadmVar, zzaha.class, zzacqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzahd zzahdVar, zzadm<zzahc> zzadmVar) throws IOException {
        e0.i(zzahdVar);
        e0.i(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadp.zza(zzacpVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzahdVar, zzadmVar, zzahc.class, zzacpVar.zza);
    }
}
