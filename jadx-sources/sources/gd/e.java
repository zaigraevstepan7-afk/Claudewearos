package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new dd.d(29);

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f7380z;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7382b;

    /* renamed from: c, reason: collision with root package name */
    public f f7383c;

    /* renamed from: d, reason: collision with root package name */
    public String f7384d;

    /* renamed from: e, reason: collision with root package name */
    public String f7385e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7386f;

    static {
        HashMap map = new HashMap();
        f7380z = map;
        map.put("authenticatorInfo", new sd.a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        map.put("signature", new sd.a(7, false, 7, false, "signature", 3, null));
        map.put("package", new sd.a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i10, f fVar, String str, String str2, String str3) {
        this.f7381a = hashSet;
        this.f7382b = i10;
        this.f7383c = fVar;
        this.f7384d = str;
        this.f7385e = str2;
        this.f7386f = str3;
    }

    @Override // sd.b
    public final void addConcreteTypeInternal(sd.a aVar, String str, sd.b bVar) {
        int i10 = aVar.f14977z;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), bVar.getClass().getCanonicalName()));
        }
        this.f7383c = (f) bVar;
        this.f7381a.add(Integer.valueOf(i10));
    }

    @Override // sd.b
    public final /* synthetic */ Map getFieldMappings() {
        return f7380z;
    }

    @Override // sd.b
    public final Object getFieldValue(sd.a aVar) {
        int i10 = aVar.f14977z;
        if (i10 == 1) {
            return Integer.valueOf(this.f7382b);
        }
        if (i10 == 2) {
            return this.f7383c;
        }
        if (i10 == 3) {
            return this.f7384d;
        }
        if (i10 == 4) {
            return this.f7385e;
        }
        throw new IllegalStateException(m6.a.d(aVar.f14977z, "Unknown SafeParcelable id="));
    }

    @Override // sd.b
    public final boolean isFieldSet(sd.a aVar) {
        return this.f7381a.contains(Integer.valueOf(aVar.f14977z));
    }

    @Override // sd.b
    public final void setStringInternal(sd.a aVar, String str, String str2) {
        int i10 = aVar.f14977z;
        if (i10 == 3) {
            this.f7384d = str2;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
            }
            this.f7385e = str2;
        }
        this.f7381a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        HashSet hashSet = this.f7381a;
        if (hashSet.contains(1)) {
            uk.c.k0(parcel, 1, 4);
            parcel.writeInt(this.f7382b);
        }
        if (hashSet.contains(2)) {
            uk.c.b0(parcel, 2, this.f7383c, i10, true);
        }
        if (hashSet.contains(3)) {
            uk.c.c0(parcel, 3, this.f7384d, true);
        }
        if (hashSet.contains(4)) {
            uk.c.c0(parcel, 4, this.f7385e, true);
        }
        if (hashSet.contains(5)) {
            uk.c.c0(parcel, 5, this.f7386f, true);
        }
        uk.c.j0(iH0, parcel);
    }
}
