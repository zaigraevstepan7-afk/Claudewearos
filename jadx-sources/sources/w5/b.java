package w5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new pc.j(13);
    public final int A;
    public final CharSequence B;
    public final int C;
    public final CharSequence D;
    public final ArrayList E;
    public final ArrayList F;
    public final boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18606b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18607c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18608d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18609e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18610f;

    /* renamed from: z, reason: collision with root package name */
    public final int f18611z;

    public b(a aVar) {
        int size = aVar.f18586a.size();
        this.f18605a = new int[size * 6];
        if (!aVar.f18592g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f18606b = new ArrayList(size);
        this.f18607c = new int[size];
        this.f18608d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = (o0) aVar.f18586a.get(i11);
            int i12 = i10 + 1;
            this.f18605a[i10] = o0Var.f18703a;
            ArrayList arrayList = this.f18606b;
            t tVar = o0Var.f18704b;
            arrayList.add(tVar != null ? tVar.f18761e : null);
            int[] iArr = this.f18605a;
            iArr[i12] = o0Var.f18705c ? 1 : 0;
            iArr[i10 + 2] = o0Var.f18706d;
            iArr[i10 + 3] = o0Var.f18707e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = o0Var.f18708f;
            i10 += 6;
            iArr[i13] = o0Var.f18709g;
            this.f18607c[i11] = o0Var.f18710h.ordinal();
            this.f18608d[i11] = o0Var.f18711i.ordinal();
        }
        this.f18609e = aVar.f18591f;
        this.f18610f = aVar.f18593h;
        this.f18611z = aVar.f18603s;
        this.A = aVar.f18594i;
        this.B = aVar.j;
        this.C = aVar.f18595k;
        this.D = aVar.f18596l;
        this.E = aVar.f18597m;
        this.F = aVar.f18598n;
        this.G = aVar.f18599o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f18605a);
        parcel.writeStringList(this.f18606b);
        parcel.writeIntArray(this.f18607c);
        parcel.writeIntArray(this.f18608d);
        parcel.writeInt(this.f18609e);
        parcel.writeString(this.f18610f);
        parcel.writeInt(this.f18611z);
        parcel.writeInt(this.A);
        TextUtils.writeToParcel(this.B, parcel, 0);
        parcel.writeInt(this.C);
        TextUtils.writeToParcel(this.D, parcel, 0);
        parcel.writeStringList(this.E);
        parcel.writeStringList(this.F);
        parcel.writeInt(this.G ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f18605a = parcel.createIntArray();
        this.f18606b = parcel.createStringArrayList();
        this.f18607c = parcel.createIntArray();
        this.f18608d = parcel.createIntArray();
        this.f18609e = parcel.readInt();
        this.f18610f = parcel.readString();
        this.f18611z = parcel.readInt();
        this.A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.B = (CharSequence) creator.createFromParcel(parcel);
        this.C = parcel.readInt();
        this.D = (CharSequence) creator.createFromParcel(parcel);
        this.E = parcel.createStringArrayList();
        this.F = parcel.createStringArrayList();
        this.G = parcel.readInt() != 0;
    }
}
