package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfyh {
    Object[] zza;
    int zzb;
    zzfyg zzc;

    public zzfyh() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfxz.zze(length, i11));
        }
    }

    public final zzfyh zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfxc.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzfyh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfyi zzc() {
        zzfyg zzfygVar = this.zzc;
        if (zzfygVar != null) {
            throw zzfygVar.zza();
        }
        zzfzw zzfzwVarZzj = zzfzw.zzj(this.zzb, this.zza, this);
        zzfyg zzfygVar2 = this.zzc;
        if (zzfygVar2 == null) {
            return zzfzwVarZzj;
        }
        throw zzfygVar2.zza();
    }

    public zzfyh(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
