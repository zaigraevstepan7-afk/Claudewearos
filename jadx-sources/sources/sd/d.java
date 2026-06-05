package sd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.e0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import pc.j;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new j(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f14978a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f14979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14980c;

    /* renamed from: d, reason: collision with root package name */
    public final h f14981d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14982e;

    /* renamed from: f, reason: collision with root package name */
    public int f14983f;

    /* renamed from: z, reason: collision with root package name */
    public int f14984z;

    public d(int i10, Parcel parcel, h hVar) {
        this.f14978a = i10;
        e0.i(parcel);
        this.f14979b = parcel;
        this.f14980c = 2;
        this.f14981d = hVar;
        this.f14982e = hVar == null ? null : hVar.f14993c;
        this.f14983f = 2;
    }

    public static void e(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a) entry.getValue()).f14977z, entry);
        }
        sb2.append('{');
        int iK0 = v.k0(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i10);
            if (entry2 != null) {
                if (z2) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                a aVar = (a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                rd.a aVar2 = aVar.D;
                String str2 = aVar.B;
                int i11 = aVar.f14974d;
                if (aVar2 != null) {
                    switch (i11) {
                        case 0:
                            g(sb2, aVar, b.zaD(aVar, Integer.valueOf(v.Z(i10, parcel))));
                            break;
                        case 1:
                            int iD0 = v.d0(i10, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iD0 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iD0);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            g(sb2, aVar, b.zaD(aVar, bigInteger2));
                            break;
                        case 2:
                            g(sb2, aVar, b.zaD(aVar, Long.valueOf(v.b0(i10, parcel))));
                            break;
                        case 3:
                            g(sb2, aVar, b.zaD(aVar, Float.valueOf(v.W(i10, parcel))));
                            break;
                        case 4:
                            v.o0(parcel, i10, 8);
                            g(sb2, aVar, b.zaD(aVar, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            g(sb2, aVar, b.zaD(aVar, v.p(i10, parcel)));
                            break;
                        case 6:
                            g(sb2, aVar, b.zaD(aVar, Boolean.valueOf(v.U(i10, parcel))));
                            break;
                        case 7:
                            g(sb2, aVar, b.zaD(aVar, v.v(i10, parcel)));
                            break;
                        case 8:
                        case 9:
                            g(sb2, aVar, b.zaD(aVar, v.r(i10, parcel)));
                            break;
                        case 10:
                            Bundle bundleQ = v.q(i10, parcel);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleQ.keySet()) {
                                String string = bundleQ.getString(str3);
                                e0.i(string);
                                map2.put(str3, string);
                            }
                            g(sb2, aVar, b.zaD(aVar, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(m6.a.d(i11, "Unknown field out type = "));
                    }
                } else if (aVar.f14975e) {
                    sb2.append("[");
                    switch (i11) {
                        case 0:
                            int[] iArrS = v.s(i10, parcel);
                            int length = iArrS.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                if (i12 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(iArrS[i12]);
                            }
                            break;
                        case 1:
                            int iD02 = v.d0(i10, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iD02 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i13 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i13];
                                for (int i14 = 0; i14 < i13; i14++) {
                                    bigIntegerArr[i14] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iD02);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i15 = 0; i15 < length2; i15++) {
                                if (i15 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigIntegerArr[i15]);
                            }
                            break;
                        case 2:
                            int iD03 = v.d0(i10, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iD03 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iD03);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i16 = 0; i16 < length3; i16++) {
                                if (i16 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(jArrCreateLongArray[i16]);
                            }
                            break;
                        case 3:
                            int iD04 = v.d0(i10, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iD04 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iD04);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i17 = 0; i17 < length4; i17++) {
                                if (i17 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(fArrCreateFloatArray[i17]);
                            }
                            break;
                        case 4:
                            int iD05 = v.d0(i10, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iD05 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iD05);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i18 = 0; i18 < length5; i18++) {
                                if (i18 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(dArrCreateDoubleArray[i18]);
                            }
                            break;
                        case 5:
                            int iD06 = v.d0(i10, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iD06 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i19 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i19];
                                for (int i20 = 0; i20 < i19; i20++) {
                                    bigDecimalArr[i20] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iD06);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i21 = 0; i21 < length6; i21++) {
                                if (i21 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigDecimalArr[i21]);
                            }
                            break;
                        case 6:
                            int iD07 = v.d0(i10, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iD07 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iD07);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i22 = 0; i22 < length7; i22++) {
                                if (i22 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(zArrCreateBooleanArray[i22]);
                            }
                            break;
                        case 7:
                            String[] strArrW = v.w(i10, parcel);
                            int length8 = strArrW.length;
                            for (int i23 = 0; i23 < length8; i23++) {
                                if (i23 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(strArrW[i23]);
                                sb2.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iD08 = v.d0(i10, parcel);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iD08 == 0) {
                                parcelArr = null;
                            } else {
                                int i24 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i24];
                                for (int i25 = 0; i25 < i24; i25++) {
                                    int i26 = parcel.readInt();
                                    if (i26 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i26);
                                        parcelArr2[i25] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i26);
                                    } else {
                                        parcelArr2[i25] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iD08);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i27 = 0; i27 < length9; i27++) {
                                if (i27 > 0) {
                                    sb2.append(",");
                                }
                                parcelArr[i27].setDataPosition(0);
                                e0.i(str2);
                                e0.i(aVar.C);
                                Map map3 = (Map) aVar.C.f14992b.get(str2);
                                e0.i(map3);
                                e(sb2, map3, parcelArr[i27]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (i11) {
                        case 0:
                            sb2.append(v.Z(i10, parcel));
                            break;
                        case 1:
                            int iD09 = v.d0(i10, parcel);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iD09 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iD09);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb2.append(bigInteger);
                            break;
                        case 2:
                            sb2.append(v.b0(i10, parcel));
                            break;
                        case 3:
                            sb2.append(v.W(i10, parcel));
                            break;
                        case 4:
                            v.o0(parcel, i10, 8);
                            sb2.append(parcel.readDouble());
                            break;
                        case 5:
                            sb2.append(v.p(i10, parcel));
                            break;
                        case 6:
                            sb2.append(v.U(i10, parcel));
                            break;
                        case 7:
                            String strV = v.v(i10, parcel);
                            sb2.append("\"");
                            sb2.append(ud.d.a(strV));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] bArrR = v.r(i10, parcel);
                            sb2.append("\"");
                            sb2.append(bArrR == null ? null : Base64.encodeToString(bArrR, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] bArrR2 = v.r(i10, parcel);
                            sb2.append("\"");
                            sb2.append(bArrR2 == null ? null : Base64.encodeToString(bArrR2, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle bundleQ2 = v.q(i10, parcel);
                            Set<String> setKeySet = bundleQ2.keySet();
                            sb2.append("{");
                            boolean z10 = true;
                            for (String str4 : setKeySet) {
                                if (!z10) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str4);
                                sb2.append("\":\"");
                                sb2.append(ud.d.a(bundleQ2.getString(str4)));
                                sb2.append("\"");
                                z10 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            int iD010 = v.d0(i10, parcel);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iD010 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iD010);
                                parcel.setDataPosition(iDataPosition11 + iD010);
                            }
                            parcelObtain.setDataPosition(0);
                            e0.i(str2);
                            e0.i(aVar.C);
                            Map map4 = (Map) aVar.C.f14992b.get(str2);
                            e0.i(map4);
                            e(sb2, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() != iK0) {
            throw new b3.e(m6.a.d(iK0, "Overread allowed size end="), parcel);
        }
        sb2.append('}');
    }

    public static final void f(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                e0.i(obj);
                sb2.append(ud.d.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                e0.i(obj);
                ud.c.o(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(m6.a.d(i10, "Unknown type = "));
        }
    }

    public static final void g(StringBuilder sb2, a aVar, Object obj) {
        boolean z2 = aVar.f14973c;
        int i10 = aVar.f14972b;
        if (!z2) {
            f(sb2, i10, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            f(sb2, i10, arrayList.get(i11));
        }
        sb2.append("]");
    }

    @Override // sd.b
    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        ArrayList arrayList2 = new ArrayList();
        e0.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((d) ((b) arrayList.get(i10))).c());
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i12);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        d(aVar);
        Parcel parcelC = ((d) bVar).c();
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        if (parcelC == null) {
            uk.c.k0(parcel, i10, 0);
            return;
        }
        int iH0 = uk.c.h0(i10, parcel);
        parcel.appendFrom(parcelC, 0, parcelC.dataSize());
        uk.c.j0(iH0, parcel);
    }

    public final Parcel c() {
        int i10 = this.f14983f;
        Parcel parcel = this.f14979b;
        if (i10 != 0) {
            if (i10 != 1) {
                return parcel;
            }
            uk.c.j0(this.f14984z, parcel);
            this.f14983f = 2;
            return parcel;
        }
        int iH0 = uk.c.h0(20293, parcel);
        this.f14984z = iH0;
        uk.c.j0(iH0, parcel);
        this.f14983f = 2;
        return parcel;
    }

    public final void d(a aVar) {
        if (aVar.f14977z == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f14979b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f14983f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f14984z = uk.c.h0(20293, parcel);
            this.f14983f = 1;
        }
    }

    @Override // sd.b
    public final Map getFieldMappings() {
        h hVar = this.f14981d;
        if (hVar == null) {
            return null;
        }
        String str = this.f14982e;
        e0.i(str);
        return (Map) hVar.f14992b.get(str);
    }

    @Override // sd.c, sd.b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // sd.c, sd.b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // sd.b
    public final void setBooleanInternal(a aVar, String str, boolean z2) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        uk.c.k0(parcel, i10, 4);
        parcel.writeInt(z2 ? 1 : 0);
    }

    @Override // sd.b
    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        d(aVar);
        uk.c.V(this.f14979b, aVar.f14977z, bArr, true);
    }

    @Override // sd.b
    public final void setIntegerInternal(a aVar, String str, int i10) {
        d(aVar);
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        uk.c.k0(parcel, i11, 4);
        parcel.writeInt(i10);
    }

    @Override // sd.b
    public final void setLongInternal(a aVar, String str, long j) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        uk.c.k0(parcel, i10, 8);
        parcel.writeLong(j);
    }

    @Override // sd.b
    public final void setStringInternal(a aVar, String str, String str2) {
        d(aVar);
        uk.c.c0(this.f14979b, aVar.f14977z, str2, true);
    }

    @Override // sd.b
    public final void setStringMapInternal(a aVar, String str, Map map) {
        d(aVar);
        Bundle bundle = new Bundle();
        e0.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        uk.c.U(this.f14979b, aVar.f14977z, bundle, true);
    }

    @Override // sd.b
    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        uk.c.d0(this.f14979b, aVar.f14977z, strArr, true);
    }

    @Override // sd.b
    public final String toString() {
        h hVar = this.f14981d;
        e0.j(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelC = c();
        parcelC.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f14982e;
        e0.i(str);
        Map map = (Map) hVar.f14992b.get(str);
        e0.i(map);
        e(sb2, map, parcelC);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14978a);
        Parcel parcelC = c();
        if (parcelC != null) {
            int iH02 = uk.c.h0(2, parcel);
            parcel.appendFrom(parcelC, 0, parcelC.dataSize());
            uk.c.j0(iH02, parcel);
        }
        uk.c.b0(parcel, 3, this.f14980c != 0 ? this.f14981d : null, i10, false);
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zab(a aVar, String str, BigDecimal bigDecimal) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        if (bigDecimal == null) {
            uk.c.k0(parcel, i10, 0);
            return;
        }
        int iH0 = uk.c.h0(i10, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zad(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigDecimalArr[i12].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i12].scale());
        }
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zaf(a aVar, String str, BigInteger bigInteger) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        if (bigInteger == null) {
            uk.c.k0(parcel, i10, 0);
            return;
        }
        int iH0 = uk.c.h0(i10, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zah(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(bigIntegerArr[i12].toByteArray());
        }
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zak(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeBooleanArray(zArr);
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zan(a aVar, String str, double d10) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        uk.c.k0(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    @Override // sd.b
    public final void zap(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeDoubleArray(dArr);
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zar(a aVar, String str, float f10) {
        d(aVar);
        int i10 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        uk.c.k0(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    @Override // sd.b
    public final void zat(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeFloatArray(fArr);
        uk.c.j0(iH0, parcel);
    }

    @Override // sd.b
    public final void zaw(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        uk.c.Y(this.f14979b, aVar.f14977z, iArr, true);
    }

    @Override // sd.b
    public final void zaz(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        e0.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        int i11 = aVar.f14977z;
        Parcel parcel = this.f14979b;
        int iH0 = uk.c.h0(i11, parcel);
        parcel.writeLongArray(jArr);
        uk.c.j0(iH0, parcel);
    }
}
