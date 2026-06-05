package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzac {
    private final zzj zza;
    private final boolean zzb;
    private final zzai zzc;
    private final int zzd;

    private zzac(zzai zzaiVar) {
        this(zzaiVar, false, zzn.zza, f.API_PRIORITY_OTHER);
    }

    public static zzac zza(char c6) {
        zzl zzlVar = new zzl(c6);
        zzz.zza(zzlVar);
        return new zzac(new zzab(zzlVar));
    }

    private zzac(zzai zzaiVar, boolean z2, zzj zzjVar, int i10) {
        this.zzc = zzaiVar;
        this.zzb = false;
        this.zza = zzjVar;
        this.zzd = f.API_PRIORITY_OTHER;
    }

    public static zzac zza(String str) {
        zzs zzsVarZza = zzy.zza(str);
        if (!zzsVarZza.zza("").zzc()) {
            return new zzac(new zzad(zzsVarZza));
        }
        throw new IllegalArgumentException(zzah.zza("The pattern may not match the empty string: %s", zzsVarZza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzz.zza(charSequence);
        Iterator<String> itZza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add(itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
