package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zzbch;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4961d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4962e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4963f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4964a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4965b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4966c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4962e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4963f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(a aVar, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.F;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.F.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z2) {
        int i10;
        int i11;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? s.f4969c : s.f4967a);
        m mVar = jVar.f4890b;
        n nVar = jVar.f4893e;
        l lVar = jVar.f4891c;
        k kVar = jVar.f4892d;
        int[] iArr = f4961d;
        String[] strArr = z3.a.f20372a;
        SparseIntArray sparseIntArray = f4962e;
        if (z2) {
            i iVar = new i();
            iVar.f4878a = new int[10];
            iVar.f4879b = new int[10];
            iVar.f4880c = 0;
            iVar.f4881d = new int[10];
            iVar.f4882e = new float[10];
            iVar.f4883f = 0;
            iVar.f4884g = new int[5];
            iVar.f4885h = new String[5];
            iVar.f4886i = 0;
            iVar.j = new int[4];
            iVar.f4887k = new boolean[4];
            iVar.f4888l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i12 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i11) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = i12;
                switch (f4963f.get(index)) {
                    case 2:
                        i11 = indexCount;
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        continue;
                        i12 = i13 + 1;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i11 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i11 = indexCount;
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i12 = i13 + 1;
                    case 6:
                        i11 = indexCount;
                        iVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.B));
                        break;
                    case 7:
                        i11 = indexCount;
                        iVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.C));
                        break;
                    case 8:
                        i11 = indexCount;
                        iVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        break;
                    case 11:
                        i11 = indexCount;
                        iVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        break;
                    case 12:
                        i11 = indexCount;
                        iVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case 13:
                        i11 = indexCount;
                        iVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.L));
                        break;
                    case 14:
                        i11 = indexCount;
                        iVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.N));
                        break;
                    case 15:
                        i11 = indexCount;
                        iVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Q));
                        break;
                    case 16:
                        i11 = indexCount;
                        iVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 17:
                        i11 = indexCount;
                        iVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4902d));
                        break;
                    case 18:
                        i11 = indexCount;
                        iVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4904e));
                        break;
                    case 19:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f4906f), 19);
                        break;
                    case 20:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f4930v), 20);
                        break;
                    case zzbch.zzt.zzm /* 21 */:
                        i11 = indexCount;
                        iVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f4900c));
                        break;
                    case 22:
                        i11 = indexCount;
                        iVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.f4944a)]);
                        break;
                    case 23:
                        i11 = indexCount;
                        iVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f4898b));
                        break;
                    case 24:
                        i11 = indexCount;
                        iVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.E));
                        break;
                    case 27:
                        i11 = indexCount;
                        iVar.b(27, typedArrayObtainStyledAttributes.getInt(index, kVar.D));
                        break;
                    case 28:
                        i11 = indexCount;
                        iVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        break;
                    case 31:
                        i11 = indexCount;
                        iVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.J));
                        break;
                    case 34:
                        i11 = indexCount;
                        iVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        break;
                    case 37:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f4931w), 37);
                        break;
                    case 38:
                        i11 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f4889a);
                        jVar.f4889a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case 39:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.T), 39);
                        break;
                    case 40:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.S), 40);
                        break;
                    case 41:
                        i11 = indexCount;
                        iVar.b(41, typedArrayObtainStyledAttributes.getInt(index, kVar.U));
                        break;
                    case 42:
                        i11 = indexCount;
                        iVar.b(42, typedArrayObtainStyledAttributes.getInt(index, kVar.V));
                        break;
                    case 43:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f4946c), 43);
                        break;
                    case 44:
                        i11 = indexCount;
                        iVar.d(44, true);
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.f4960m), 44);
                        break;
                    case 45:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, nVar.f4950b), 45);
                        break;
                    case 46:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, nVar.f4951c), 46);
                        break;
                    case 47:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, nVar.f4952d), 47);
                        break;
                    case 48:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, nVar.f4953e), 48);
                        break;
                    case 49:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.f4954f), 49);
                        break;
                    case 50:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.f4955g), 50);
                        break;
                    case 51:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.f4957i), 51);
                        break;
                    case 52:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.j), 52);
                        break;
                    case 53:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getDimension(index, nVar.f4958k), 53);
                        break;
                    case 54:
                        i11 = indexCount;
                        iVar.b(54, typedArrayObtainStyledAttributes.getInt(index, kVar.W));
                        break;
                    case 55:
                        i11 = indexCount;
                        iVar.b(55, typedArrayObtainStyledAttributes.getInt(index, kVar.X));
                        break;
                    case 56:
                        i11 = indexCount;
                        iVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Y));
                        break;
                    case 57:
                        i11 = indexCount;
                        iVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Z));
                        break;
                    case 58:
                        i11 = indexCount;
                        iVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4897a0));
                        break;
                    case 59:
                        i11 = indexCount;
                        iVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4899b0));
                        break;
                    case 60:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, nVar.f4949a), 60);
                        break;
                    case 62:
                        i11 = indexCount;
                        iVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4934z));
                        break;
                    case 63:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.A), 63);
                        break;
                    case 64:
                        i11 = indexCount;
                        iVar.b(64, f(typedArrayObtainStyledAttributes, index, lVar.f4935a));
                        break;
                    case 65:
                        i11 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            iVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i11 = indexCount;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f4939e), 67);
                        break;
                    case 68:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f4947d), 68);
                        break;
                    case 69:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i11 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i11 = indexCount;
                        iVar.b(72, typedArrayObtainStyledAttributes.getInt(index, kVar.f4905e0));
                        break;
                    case 73:
                        i11 = indexCount;
                        iVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4907f0));
                        break;
                    case 74:
                        i11 = indexCount;
                        iVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i11 = indexCount;
                        iVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4920m0));
                        break;
                    case 76:
                        i11 = indexCount;
                        iVar.b(76, typedArrayObtainStyledAttributes.getInt(index, lVar.f4937c));
                        break;
                    case 77:
                        i11 = indexCount;
                        iVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i11 = indexCount;
                        iVar.b(78, typedArrayObtainStyledAttributes.getInt(index, mVar.f4945b));
                        break;
                    case 79:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f4938d), 79);
                        break;
                    case 80:
                        i11 = indexCount;
                        iVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4916k0));
                        break;
                    case 81:
                        i11 = indexCount;
                        iVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4918l0));
                        break;
                    case 82:
                        i11 = indexCount;
                        iVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4936b));
                        break;
                    case 83:
                        i11 = indexCount;
                        iVar.b(83, f(typedArrayObtainStyledAttributes, index, nVar.f4956h));
                        break;
                    case 84:
                        i11 = indexCount;
                        iVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4941g));
                        break;
                    case 85:
                        i11 = indexCount;
                        iVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f4940f), 85);
                        break;
                    case 86:
                        i11 = indexCount;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.f4943i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.f4943i != -1) {
                                iVar.b(88, -2);
                                break;
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            lVar.f4942h = string;
                            iVar.c(90, string);
                            if (lVar.f4942h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                lVar.f4943i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                                break;
                            } else {
                                iVar.b(88, -1);
                                break;
                            }
                        } else {
                            iVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4943i));
                            break;
                        }
                        break;
                    case 87:
                        i11 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i11 = indexCount;
                        iVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.K));
                        break;
                    case 94:
                        i11 = indexCount;
                        iVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.R));
                        break;
                    case 95:
                        i11 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i11 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i11 = indexCount;
                        iVar.b(97, typedArrayObtainStyledAttributes.getInt(index, kVar.f4922n0));
                        break;
                    case 98:
                        i11 = indexCount;
                        int i15 = c4.a.L;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            jVar.f4889a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f4889a);
                            break;
                        }
                }
                i12 = i13 + 1;
            }
        } else {
            int i16 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i16 < indexCount2; indexCount2 = i10) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i16);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i10 = indexCount2;
                        kVar.f4923o = f(typedArrayObtainStyledAttributes, index2, kVar.f4923o);
                        continue;
                        i16++;
                    case 2:
                        i10 = indexCount2;
                        kVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        continue;
                        i16++;
                    case 3:
                        i10 = indexCount2;
                        kVar.f4921n = f(typedArrayObtainStyledAttributes, index2, kVar.f4921n);
                        continue;
                        i16++;
                    case 4:
                        i10 = indexCount2;
                        kVar.f4919m = f(typedArrayObtainStyledAttributes, index2, kVar.f4919m);
                        continue;
                        i16++;
                    case 5:
                        i10 = indexCount2;
                        kVar.f4932x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i16++;
                    case 6:
                        i10 = indexCount2;
                        kVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.B);
                        continue;
                        i16++;
                    case 7:
                        i10 = indexCount2;
                        kVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        continue;
                        i16++;
                    case 8:
                        i10 = indexCount2;
                        kVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        continue;
                        i16++;
                    case 9:
                        i10 = indexCount2;
                        kVar.f4929u = f(typedArrayObtainStyledAttributes, index2, kVar.f4929u);
                        continue;
                        i16++;
                    case 10:
                        i10 = indexCount2;
                        kVar.f4928t = f(typedArrayObtainStyledAttributes, index2, kVar.f4928t);
                        continue;
                        i16++;
                    case 11:
                        i10 = indexCount2;
                        kVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        continue;
                        i16++;
                    case 12:
                        i10 = indexCount2;
                        kVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        continue;
                        i16++;
                    case 13:
                        i10 = indexCount2;
                        kVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        continue;
                        i16++;
                    case 14:
                        i10 = indexCount2;
                        kVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        continue;
                        i16++;
                    case 15:
                        i10 = indexCount2;
                        kVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        continue;
                        i16++;
                    case 16:
                        i10 = indexCount2;
                        kVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                        i16++;
                    case 17:
                        i10 = indexCount2;
                        kVar.f4902d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4902d);
                        continue;
                        i16++;
                    case 18:
                        i10 = indexCount2;
                        kVar.f4904e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4904e);
                        continue;
                        i16++;
                    case 19:
                        i10 = indexCount2;
                        kVar.f4906f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4906f);
                        continue;
                        i16++;
                    case 20:
                        i10 = indexCount2;
                        kVar.f4930v = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4930v);
                        continue;
                        i16++;
                    case zzbch.zzt.zzm /* 21 */:
                        i10 = indexCount2;
                        kVar.f4900c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f4900c);
                        continue;
                        i16++;
                    case 22:
                        i10 = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.getInt(index2, mVar.f4944a);
                        mVar.f4944a = i17;
                        mVar.f4944a = iArr[i17];
                        continue;
                        i16++;
                    case 23:
                        i10 = indexCount2;
                        kVar.f4898b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f4898b);
                        continue;
                        i16++;
                    case 24:
                        i10 = indexCount2;
                        kVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.E);
                        continue;
                        i16++;
                    case 25:
                        i10 = indexCount2;
                        kVar.f4908g = f(typedArrayObtainStyledAttributes, index2, kVar.f4908g);
                        continue;
                        i16++;
                    case 26:
                        i10 = indexCount2;
                        kVar.f4910h = f(typedArrayObtainStyledAttributes, index2, kVar.f4910h);
                        continue;
                        i16++;
                    case 27:
                        i10 = indexCount2;
                        kVar.D = typedArrayObtainStyledAttributes.getInt(index2, kVar.D);
                        continue;
                        i16++;
                    case 28:
                        i10 = indexCount2;
                        kVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        continue;
                        i16++;
                    case 29:
                        i10 = indexCount2;
                        kVar.f4912i = f(typedArrayObtainStyledAttributes, index2, kVar.f4912i);
                        continue;
                        i16++;
                    case 30:
                        i10 = indexCount2;
                        kVar.j = f(typedArrayObtainStyledAttributes, index2, kVar.j);
                        continue;
                        i16++;
                    case 31:
                        i10 = indexCount2;
                        kVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        continue;
                        i16++;
                    case 32:
                        i10 = indexCount2;
                        kVar.f4926r = f(typedArrayObtainStyledAttributes, index2, kVar.f4926r);
                        continue;
                        i16++;
                    case 33:
                        i10 = indexCount2;
                        kVar.f4927s = f(typedArrayObtainStyledAttributes, index2, kVar.f4927s);
                        continue;
                        i16++;
                    case 34:
                        i10 = indexCount2;
                        kVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        continue;
                        i16++;
                    case 35:
                        i10 = indexCount2;
                        kVar.f4917l = f(typedArrayObtainStyledAttributes, index2, kVar.f4917l);
                        continue;
                        i16++;
                    case 36:
                        i10 = indexCount2;
                        kVar.f4915k = f(typedArrayObtainStyledAttributes, index2, kVar.f4915k);
                        continue;
                        i16++;
                    case 37:
                        i10 = indexCount2;
                        kVar.f4931w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4931w);
                        continue;
                        i16++;
                    case 38:
                        i10 = indexCount2;
                        jVar.f4889a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.f4889a);
                        continue;
                        i16++;
                    case 39:
                        i10 = indexCount2;
                        kVar.T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.T);
                        continue;
                        i16++;
                    case 40:
                        i10 = indexCount2;
                        kVar.S = typedArrayObtainStyledAttributes.getFloat(index2, kVar.S);
                        continue;
                        i16++;
                    case 41:
                        i10 = indexCount2;
                        kVar.U = typedArrayObtainStyledAttributes.getInt(index2, kVar.U);
                        continue;
                        i16++;
                    case 42:
                        i10 = indexCount2;
                        kVar.V = typedArrayObtainStyledAttributes.getInt(index2, kVar.V);
                        continue;
                        i16++;
                    case 43:
                        i10 = indexCount2;
                        mVar.f4946c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4946c);
                        continue;
                        i16++;
                    case 44:
                        i10 = indexCount2;
                        nVar.f4959l = true;
                        nVar.f4960m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4960m);
                        continue;
                        i16++;
                    case 45:
                        i10 = indexCount2;
                        nVar.f4950b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4950b);
                        continue;
                        i16++;
                    case 46:
                        i10 = indexCount2;
                        nVar.f4951c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4951c);
                        continue;
                        i16++;
                    case 47:
                        i10 = indexCount2;
                        nVar.f4952d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4952d);
                        continue;
                        i16++;
                    case 48:
                        i10 = indexCount2;
                        nVar.f4953e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4953e);
                        continue;
                        i16++;
                    case 49:
                        i10 = indexCount2;
                        nVar.f4954f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4954f);
                        continue;
                        i16++;
                    case 50:
                        i10 = indexCount2;
                        nVar.f4955g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4955g);
                        continue;
                        i16++;
                    case 51:
                        i10 = indexCount2;
                        nVar.f4957i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4957i);
                        continue;
                        i16++;
                    case 52:
                        i10 = indexCount2;
                        nVar.j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.j);
                        continue;
                        i16++;
                    case 53:
                        i10 = indexCount2;
                        nVar.f4958k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4958k);
                        continue;
                        i16++;
                    case 54:
                        i10 = indexCount2;
                        kVar.W = typedArrayObtainStyledAttributes.getInt(index2, kVar.W);
                        continue;
                        i16++;
                    case 55:
                        i10 = indexCount2;
                        kVar.X = typedArrayObtainStyledAttributes.getInt(index2, kVar.X);
                        continue;
                        i16++;
                    case 56:
                        i10 = indexCount2;
                        kVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Y);
                        continue;
                        i16++;
                    case 57:
                        i10 = indexCount2;
                        kVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        continue;
                        i16++;
                    case 58:
                        i10 = indexCount2;
                        kVar.f4897a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4897a0);
                        continue;
                        i16++;
                    case 59:
                        i10 = indexCount2;
                        kVar.f4899b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4899b0);
                        continue;
                        i16++;
                    case 60:
                        i10 = indexCount2;
                        nVar.f4949a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4949a);
                        continue;
                        i16++;
                    case 61:
                        i10 = indexCount2;
                        kVar.f4933y = f(typedArrayObtainStyledAttributes, index2, kVar.f4933y);
                        continue;
                        i16++;
                    case 62:
                        i10 = indexCount2;
                        kVar.f4934z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4934z);
                        continue;
                        i16++;
                    case 63:
                        i10 = indexCount2;
                        kVar.A = typedArrayObtainStyledAttributes.getFloat(index2, kVar.A);
                        continue;
                        i16++;
                    case 64:
                        i10 = indexCount2;
                        lVar.f4935a = f(typedArrayObtainStyledAttributes, index2, lVar.f4935a);
                        continue;
                        i16++;
                    case 65:
                        i10 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            i16++;
                        }
                    case 66:
                        i10 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                        i16++;
                    case 67:
                        i10 = indexCount2;
                        lVar.f4939e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4939e);
                        break;
                    case 68:
                        i10 = indexCount2;
                        mVar.f4947d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4947d);
                        break;
                    case 69:
                        i10 = indexCount2;
                        kVar.f4901c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i10 = indexCount2;
                        kVar.f4903d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i10 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount2;
                        kVar.f4905e0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f4905e0);
                        break;
                    case 73:
                        i10 = indexCount2;
                        kVar.f4907f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4907f0);
                        break;
                    case 74:
                        i10 = indexCount2;
                        kVar.f4913i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i10 = indexCount2;
                        kVar.f4920m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4920m0);
                        break;
                    case 76:
                        i10 = indexCount2;
                        lVar.f4937c = typedArrayObtainStyledAttributes.getInt(index2, lVar.f4937c);
                        break;
                    case 77:
                        i10 = indexCount2;
                        kVar.f4914j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i10 = indexCount2;
                        mVar.f4945b = typedArrayObtainStyledAttributes.getInt(index2, mVar.f4945b);
                        break;
                    case 79:
                        i10 = indexCount2;
                        lVar.f4938d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4938d);
                        break;
                    case 80:
                        i10 = indexCount2;
                        kVar.f4916k0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4916k0);
                        break;
                    case 81:
                        i10 = indexCount2;
                        kVar.f4918l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4918l0);
                        break;
                    case 82:
                        i10 = indexCount2;
                        lVar.f4936b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4936b);
                        break;
                    case 83:
                        i10 = indexCount2;
                        nVar.f4956h = f(typedArrayObtainStyledAttributes, index2, nVar.f4956h);
                        break;
                    case 84:
                        i10 = indexCount2;
                        lVar.f4941g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4941g);
                        break;
                    case 85:
                        i10 = indexCount2;
                        lVar.f4940f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4940f);
                        break;
                    case 86:
                        i10 = indexCount2;
                        int i18 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i18 == 1) {
                            lVar.f4943i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i18 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.f4942h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.f4943i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4943i);
                            break;
                        }
                        break;
                    case 87:
                        i10 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i10 = indexCount2;
                        kVar.f4924p = f(typedArrayObtainStyledAttributes, index2, kVar.f4924p);
                        break;
                    case 92:
                        i10 = indexCount2;
                        kVar.f4925q = f(typedArrayObtainStyledAttributes, index2, kVar.f4925q);
                        break;
                    case 93:
                        i10 = indexCount2;
                        kVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        break;
                    case 94:
                        i10 = indexCount2;
                        kVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        break;
                    case 95:
                        i10 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i16++;
                    case 96:
                        i10 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i10 = indexCount2;
                        kVar.f4922n0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f4922n0);
                        break;
                }
                i16++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.o.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i10;
        HashMap map;
        String resourceEntryName;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = oVar.f4966c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (oVar.f4965b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        j jVar = (j) map2.get(Integer.valueOf(id2));
                        if (jVar != null) {
                            m mVar = jVar.f4890b;
                            k kVar = jVar.f4892d;
                            n nVar = jVar.f4893e;
                            if (childAt instanceof a) {
                                kVar.f4909g0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id2);
                                aVar.setType(kVar.f4905e0);
                                aVar.setMargin(kVar.f4907f0);
                                aVar.setAllowsGoneWidget(kVar.f4920m0);
                                int[] iArr = kVar.f4911h0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = kVar.f4913i0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        kVar.f4911h0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap map3 = jVar.f4894f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                b bVar = (b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strI = !bVar.f4807a ? m1.i("set", str2) : str2;
                                int i12 = i11;
                                try {
                                    int iB = y3.e.b(bVar.f4808b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iB) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strI, cls3).invoke(childAt, Integer.valueOf(bVar.f4809c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strI, cls2).invoke(childAt, Float.valueOf(bVar.f4810d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strI, cls3).invoke(childAt, Integer.valueOf(bVar.f4813g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strI, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f4813g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e10) {
                                                e = e10;
                                                StringBuilder sbK = m6.a.k(" Custom Attribute \"", str2, "\" not found on ");
                                                sbK.append(cls.getName());
                                                Log.e("TransitionLayout", sbK.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i11 = i12;
                                                map3 = map;
                                            } catch (NoSuchMethodException e11) {
                                                e = e11;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strI);
                                                hashSet2 = hashSet3;
                                                i11 = i12;
                                                map3 = map;
                                            } catch (InvocationTargetException e12) {
                                                e = e12;
                                                StringBuilder sbK2 = m6.a.k(" Custom Attribute \"", str2, "\" not found on ");
                                                sbK2.append(cls.getName());
                                                Log.e("TransitionLayout", sbK2.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i11 = i12;
                                                map3 = map;
                                            }
                                        case 4:
                                            cls.getMethod(strI, CharSequence.class).invoke(childAt, bVar.f4811e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strI, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f4812f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strI, cls2).invoke(childAt, Float.valueOf(bVar.f4810d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strI, cls3).invoke(childAt, Integer.valueOf(bVar.f4809c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e13) {
                                    e = e13;
                                    map = map3;
                                } catch (NoSuchMethodException e14) {
                                    e = e14;
                                    map = map3;
                                } catch (InvocationTargetException e15) {
                                    e = e15;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i11 = i12;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i10 = i11;
                            childAt.setLayoutParams(eVar);
                            if (mVar.f4945b == 0) {
                                childAt.setVisibility(mVar.f4944a);
                            }
                            childAt.setAlpha(mVar.f4946c);
                            childAt.setRotation(nVar.f4949a);
                            childAt.setRotationX(nVar.f4950b);
                            childAt.setRotationY(nVar.f4951c);
                            childAt.setScaleX(nVar.f4952d);
                            childAt.setScaleY(nVar.f4953e);
                            if (nVar.f4956h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f4956h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f4954f)) {
                                    childAt.setPivotX(nVar.f4954f);
                                }
                                if (!Float.isNaN(nVar.f4955g)) {
                                    childAt.setPivotY(nVar.f4955g);
                                }
                            }
                            childAt.setTranslationX(nVar.f4957i);
                            childAt.setTranslationY(nVar.j);
                            childAt.setTranslationZ(nVar.f4958k);
                            if (nVar.f4959l) {
                                childAt.setElevation(nVar.f4960m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i10 = i11;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i11 = i10 + 1;
                oVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i10 = i11;
            i11 = i10 + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) map2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f4892d;
                if (kVar2.f4909g0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f4814a = new int[32];
                    aVar2.f4820z = new HashMap();
                    aVar2.f4816c = context;
                    a4.a aVar3 = new a4.a();
                    aVar3.f72r0 = 0;
                    aVar3.f73s0 = true;
                    aVar3.f74t0 = 0;
                    aVar3.f75u0 = false;
                    aVar2.C = aVar3;
                    aVar2.f4817d = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f4911h0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = kVar2.f4913i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            kVar2.f4911h0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.f4905e0);
                    aVar2.setMargin(kVar2.f4907f0);
                    e eVarA = ConstraintLayout.a();
                    aVar2.i();
                    jVar2.a(eVarA);
                    constraintLayout.addView(aVar2, eVarA);
                }
                if (kVar2.f4896a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e eVarA2 = ConstraintLayout.a();
                    jVar2.a(eVarA2);
                    constraintLayout.addView(qVar, eVarA2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        HashMap map;
        HashMap map2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = oVar.f4966c;
        map3.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (oVar.f4965b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id2))) {
                map3.put(Integer.valueOf(id2), new j());
            }
            j jVar = (j) map3.get(Integer.valueOf(id2));
            if (jVar == null) {
                i10 = childCount;
                map = map3;
            } else {
                m mVar = jVar.f4890b;
                k kVar = jVar.f4892d;
                n nVar = jVar.f4893e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = oVar.f4964a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i12 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                                childCount = i12;
                                map3 = map2;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                                childCount = i12;
                                map3 = map2;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i12;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        map2 = map3;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        map2 = map3;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        map2 = map3;
                    }
                    childCount = i12;
                    map3 = map2;
                }
                i10 = childCount;
                map = map3;
                jVar.f4894f = map4;
                jVar.f4889a = id2;
                kVar.f4908g = eVar.f4828d;
                kVar.f4910h = eVar.f4830e;
                kVar.f4912i = eVar.f4832f;
                kVar.j = eVar.f4834g;
                kVar.f4915k = eVar.f4836h;
                kVar.f4917l = eVar.f4838i;
                kVar.f4919m = eVar.j;
                kVar.f4921n = eVar.f4841k;
                kVar.f4923o = eVar.f4843l;
                kVar.f4924p = eVar.f4845m;
                kVar.f4925q = eVar.f4847n;
                kVar.f4926r = eVar.f4853r;
                kVar.f4927s = eVar.f4854s;
                kVar.f4928t = eVar.f4855t;
                kVar.f4929u = eVar.f4856u;
                kVar.f4930v = eVar.D;
                kVar.f4931w = eVar.E;
                kVar.f4932x = eVar.F;
                kVar.f4933y = eVar.f4849o;
                kVar.f4934z = eVar.f4851p;
                kVar.A = eVar.f4852q;
                kVar.B = eVar.S;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.f4906f = eVar.f4826c;
                kVar.f4902d = eVar.f4822a;
                kVar.f4904e = eVar.f4824b;
                kVar.f4898b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f4900c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.E = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.K = eVar.C;
                kVar.S = eVar.H;
                kVar.T = eVar.G;
                kVar.V = eVar.J;
                kVar.U = eVar.I;
                kVar.f4916k0 = eVar.V;
                kVar.f4918l0 = eVar.W;
                kVar.W = eVar.K;
                kVar.X = eVar.L;
                kVar.Y = eVar.O;
                kVar.Z = eVar.P;
                kVar.f4897a0 = eVar.M;
                kVar.f4899b0 = eVar.N;
                kVar.f4901c0 = eVar.Q;
                kVar.f4903d0 = eVar.R;
                kVar.f4914j0 = eVar.X;
                kVar.M = eVar.f4858w;
                kVar.O = eVar.f4860y;
                kVar.L = eVar.f4857v;
                kVar.N = eVar.f4859x;
                kVar.Q = eVar.f4861z;
                kVar.P = eVar.A;
                kVar.R = eVar.B;
                kVar.f4922n0 = eVar.Y;
                kVar.I = eVar.getMarginEnd();
                kVar.J = eVar.getMarginStart();
                mVar.f4944a = childAt.getVisibility();
                mVar.f4946c = childAt.getAlpha();
                nVar.f4949a = childAt.getRotation();
                nVar.f4950b = childAt.getRotationX();
                nVar.f4951c = childAt.getRotationY();
                nVar.f4952d = childAt.getScaleX();
                nVar.f4953e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f4954f = pivotX;
                    nVar.f4955g = pivotY;
                }
                nVar.f4957i = childAt.getTranslationX();
                nVar.j = childAt.getTranslationY();
                nVar.f4958k = childAt.getTranslationZ();
                if (nVar.f4959l) {
                    nVar.f4960m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f4920m0 = aVar.getAllowsGoneWidget();
                    kVar.f4911h0 = aVar.getReferencedIds();
                    kVar.f4905e0 = aVar.getType();
                    kVar.f4907f0 = aVar.getMargin();
                }
            }
            i11++;
            oVar = this;
            childCount = i10;
            map3 = map;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.f4892d.f4896a = true;
                    }
                    this.f4966c.put(Integer.valueOf(jVarD.f4889a), jVarD);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
