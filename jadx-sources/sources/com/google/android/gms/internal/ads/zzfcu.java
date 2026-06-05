package com.google.android.gms.internal.ads;

import android.content.Context;
import fc.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfcu {
    public static s3 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbu zzfbuVar = (zzfbu) it.next();
            if (zzfbuVar.zzc) {
                arrayList.add(h.j);
            } else {
                arrayList.add(new h(zzfbuVar.zza, zzfbuVar.zzb));
            }
        }
        return new s3(context, (h[]) arrayList.toArray(new h[arrayList.size()]));
    }

    public static zzfbu zzb(s3 s3Var) {
        return s3Var.B ? new zzfbu(-3, 0, true) : new zzfbu(s3Var.f12224e, s3Var.f12221b, false);
    }
}
