package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.q;
import jg.s;
import x8.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzace extends zzacz<String, s> {
    private final String zzy;
    private final String zzz;

    public zzace(String str, String str2) {
        super(4);
        e0.f(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        char c6;
        zzafz zzafzVar = this.zzm;
        if (zzafzVar.zzg()) {
            zzafzVar.zzc();
        } else {
            zzafzVar.zzb();
        }
        zzafzVar.zzb();
        char c10 = 3;
        if (zzafzVar.zzh()) {
            String strZzd = zzafzVar.zzd();
            strZzd.getClass();
            c6 = 5;
            switch (strZzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c6 = 6;
                    break;
                case "PASSWORD_RESET":
                    c6 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c6 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    break;
                case "EMAIL_SIGNIN":
                    c6 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c6 = 2;
                    break;
                default:
                    c6 = 3;
                    break;
            }
            if (c6 != 4 && c6 != 3) {
                if (zzafzVar.zzf()) {
                    String strZzb = zzafzVar.zzb();
                    q qVarA0 = a.a0(zzafzVar.zza());
                    e0.e(strZzb);
                    e0.i(qVarA0);
                } else if (zzafzVar.zzg()) {
                    String strZzc = zzafzVar.zzc();
                    String strZzb2 = zzafzVar.zzb();
                    e0.e(strZzc);
                    e0.e(strZzb2);
                } else if (zzafzVar.zze()) {
                    e0.e(zzafzVar.zzb());
                }
            }
            c10 = c6;
        }
        if (c10 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zzd(this.zzy, this.zzz, this.zzb);
    }
}
