package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnx {
    private final Map zza = new HashMap();

    public final zzgnx zza(zzgws zzgwsVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzgwsVar.zza() != 0 && zzgwsVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzgwsVar)) {
            list = (List) map.get(zzgwsVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzgwsVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzgoa zzb() {
        return new zzgoa(this.zza, null);
    }
}
