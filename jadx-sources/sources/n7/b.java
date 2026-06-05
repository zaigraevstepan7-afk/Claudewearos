package n7;

import android.os.Parcel;
import android.util.SparseIntArray;
import q.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f11904d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f11905e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11907g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11908h;

    /* renamed from: i, reason: collision with root package name */
    public int f11909i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f11910k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // n7.a
    public final b a() {
        Parcel parcel = this.f11905e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f11906f) {
            i10 = this.f11907g;
        }
        return new b(parcel, iDataPosition, i10, m6.a.j(new StringBuilder(), this.f11908h, "  "), this.f11901a, this.f11902b, this.f11903c);
    }

    @Override // n7.a
    public final boolean e(int i10) {
        while (this.j < this.f11907g) {
            int i11 = this.f11910k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f11905e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f11910k = parcel.readInt();
            this.j += i13;
        }
        return this.f11910k == i10;
    }

    @Override // n7.a
    public final void h(int i10) {
        int i11 = this.f11909i;
        SparseIntArray sparseIntArray = this.f11904d;
        Parcel parcel = this.f11905e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f11909i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f11904d = new SparseIntArray();
        this.f11909i = -1;
        this.f11910k = -1;
        this.f11905e = parcel;
        this.f11906f = i10;
        this.f11907g = i11;
        this.j = i10;
        this.f11908h = str;
    }
}
