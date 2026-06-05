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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import nd.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzv extends m {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, hVar);
    }

    public zzv(Activity activity) {
        super(activity, activity, zzc, e.j, l.f3608c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zzac.zzb};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3596b = 1566;
        return doWrite(xVarA.a());
    }

    public zzv(Context context) {
        super(context, null, zzc, e.j, l.f3608c);
    }
}
