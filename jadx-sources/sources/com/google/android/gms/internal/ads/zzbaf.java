package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbaf {
    private final int zza;
    private final zzbac zzb = new zzbah();

    public zzbaf(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbae zzbaeVar = new zzbae();
        int i11 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new zzbad(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbag.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbak.zzc(strArrZzb, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbaeVar.zzb.write(this.zzb.zzb(((zzbaj) it.next()).zzb));
            } catch (IOException e10) {
                int i12 = l0.f13401b;
                k.e("Error while writing hash to byteStream", e10);
            }
        }
        return zzbaeVar.toString();
    }
}
