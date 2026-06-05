package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import nc.q3;
import nc.v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfem implements zzfel {
    private final Object[] zza;

    public zzfem(q3 q3Var, String str, int i10, String str2, v3 v3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(q3Var.f12191b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(q3Var.f12192c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(q3Var.f12192c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(q3Var.f12193d));
        }
        if (hashSet.contains("keywords")) {
            List list = q3Var.f12194e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(q3Var.f12195f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(q3Var.f12196z));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(q3Var.A));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(q3Var.B);
        }
        if (hashSet.contains("location")) {
            Location location = q3Var.D;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(q3Var.E);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(q3Var.F));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(q3Var.G));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = q3Var.H;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(q3Var.I);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(q3Var.J);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(q3Var.K));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(q3Var.M));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(q3Var.N);
        }
        if (hashSet.contains("orientation")) {
            if (v3Var != null) {
                arrayList.add(Integer.valueOf(v3Var.f12256a));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb2.append(obj == null ? "null" : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final boolean equals(Object obj) {
        if (obj instanceof zzfem) {
            return Arrays.equals(this.zza, ((zzfem) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }
}
