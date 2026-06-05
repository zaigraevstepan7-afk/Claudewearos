package id;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import ed.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a extends m {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        g gVar = new g(6);
        zzb = gVar;
        zzc = new i("SmsRetriever.API", gVar, hVar);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, e.j, l.f3608c);
    }

    public a(Context context) {
        super(context, null, zzc, e.j, l.f3608c);
    }
}
