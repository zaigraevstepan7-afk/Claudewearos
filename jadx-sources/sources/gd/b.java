package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new dd.d(27);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f7367f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7369b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7370c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7371d;

    /* renamed from: e, reason: collision with root package name */
    public d f7372e;

    static {
        HashMap map = new HashMap();
        f7367f = map;
        map.put("authenticatorData", new sd.a(11, true, 11, true, "authenticatorData", 2, e.class));
        map.put("progress", new sd.a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i10, ArrayList arrayList, int i11, d dVar) {
        this.f7368a = hashSet;
        this.f7369b = i10;
        this.f7370c = arrayList;
        this.f7371d = i11;
        this.f7372e = dVar;
    }

    @Override // sd.b
    public final void addConcreteTypeArrayInternal(sd.a aVar, String str, ArrayList arrayList) {
        int i10 = aVar.f14977z;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i10), arrayList.getClass().getCanonicalName()));
        }
        this.f7370c = arrayList;
        this.f7368a.add(Integer.valueOf(i10));
    }

    @Override // sd.b
    public final void addConcreteTypeInternal(sd.a aVar, String str, sd.b bVar) {
        int i10 = aVar.f14977z;
        if (i10 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), bVar.getClass().getCanonicalName()));
        }
        this.f7372e = (d) bVar;
        this.f7368a.add(Integer.valueOf(i10));
    }

    @Override // sd.b
    public final /* synthetic */ Map getFieldMappings() {
        return f7367f;
    }

    @Override // sd.b
    public final Object getFieldValue(sd.a aVar) {
        int i10 = aVar.f14977z;
        if (i10 == 1) {
            return Integer.valueOf(this.f7369b);
        }
        if (i10 == 2) {
            return this.f7370c;
        }
        if (i10 == 4) {
            return this.f7372e;
        }
        throw new IllegalStateException(m6.a.d(aVar.f14977z, "Unknown SafeParcelable id="));
    }

    @Override // sd.b
    public final boolean isFieldSet(sd.a aVar) {
        return this.f7368a.contains(Integer.valueOf(aVar.f14977z));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        HashSet hashSet = this.f7368a;
        if (hashSet.contains(1)) {
            uk.c.k0(parcel, 1, 4);
            parcel.writeInt(this.f7369b);
        }
        if (hashSet.contains(2)) {
            uk.c.g0(parcel, 2, this.f7370c, true);
        }
        if (hashSet.contains(3)) {
            uk.c.k0(parcel, 3, 4);
            parcel.writeInt(this.f7371d);
        }
        if (hashSet.contains(4)) {
            uk.c.b0(parcel, 4, this.f7372e, i10, true);
        }
        uk.c.j0(iH0, parcel);
    }
}
