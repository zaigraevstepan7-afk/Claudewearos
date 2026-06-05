package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import id.a;
import nd.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        x xVarA = y.a();
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3599e = new d[]{zzac.zzc};
        xVarA.f3596b = 1567;
        return doWrite(xVarA.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        x xVarA = y.a();
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3599e = new d[]{zzac.zzd};
        xVarA.f3596b = 1568;
        return doWrite(xVarA.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
