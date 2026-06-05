package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
class zzali<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzalt> zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzalu zze;
    private Map<K, V> zzf;
    private volatile zzalm zzg;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzali<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzalu(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzali)) {
            return super.equals(obj);
        }
        zzali zzaliVar = (zzali) obj;
        int size = size();
        if (size != zzaliVar.size()) {
            return false;
        }
        int iZza = zza();
        if (iZza != zzaliVar.zza()) {
            return entrySet().equals(zzaliVar.entrySet());
        }
        for (int i10 = 0; i10 < iZza; i10++) {
            if (!zzb(i10).equals(zzaliVar.zzb(i10))) {
                return false;
            }
        }
        if (iZza != size) {
            return this.zzc.equals(zzaliVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzali<K, V>) comparable);
        return iZza >= 0 ? (V) this.zzb.get(iZza).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZza = zza();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iZza; i10++) {
            iHashCode += this.zzb.get(i10).hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzali<K, V>) obj, (Comparable) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzali<K, V>) comparable);
        if (iZza >= 0) {
            return zzc(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb.size();
    }

    public final boolean zze() {
        return this.zzd;
    }

    private zzali(int i10) {
        this.zza = i10;
        this.zzb = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i10) {
        zzg();
        V v9 = (V) this.zzb.remove(i10).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zzb.add(new zzalt(this, it.next()));
            it.remove();
        }
        return v9;
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? zzalo.zza() : this.zzc.entrySet();
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalt> r0 = r4.zzb
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalt> r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.firebase-auth-api.zzalt r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzalt) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzalt> r3 = r4.zzb
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.firebase-auth-api.zzalt r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzalt) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzali.zza(java.lang.Comparable):int");
    }

    public final Map.Entry<K, V> zzb(int i10) {
        return this.zzb.get(i10);
    }

    public final int zza() {
        return this.zzb.size();
    }

    public static <FieldDescriptorType extends zzaiz<FieldDescriptorType>> zzali<FieldDescriptorType, Object> zza(int i10) {
        return new zzall(i10);
    }

    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzg == null) {
            this.zzg = new zzalm(this);
        }
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k10, V v9) {
        zzg();
        int iZza = zza((zzali<K, V>) k10);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).setValue(v9);
        }
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i10 = -(iZza + 1);
        if (i10 >= this.zza) {
            return zzf().put(k10, v9);
        }
        int size = this.zzb.size();
        int i11 = this.zza;
        if (size == i11) {
            zzalt zzaltVarRemove = this.zzb.remove(i11 - 1);
            zzf().put((Comparable) zzaltVarRemove.getKey(), zzaltVarRemove.getValue());
        }
        this.zzb.add(i10, new zzalt(this, k10, v9));
        return null;
    }
}
