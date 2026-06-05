package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import nd.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzr extends m {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, hVar);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.j, l.f3608c);
    }

    public final Task<Integer> checkPermissionState() {
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zzac.zza};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3596b = 1564;
        return doRead(xVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        e0.i(str);
        e0.a("The package name cannot be empty.", !str.isEmpty());
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zzac.zza};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3596b = 1565;
        return doRead(xVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zzac.zza};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3596b = 1563;
        return doWrite(xVarA.a());
    }

    public zzr(Context context) {
        super(context, null, zzc, e.j, l.f3608c);
    }
}
