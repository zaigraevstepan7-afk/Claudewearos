package mk;

import a2.d0;
import a5.d;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.window.BackEvent;
import b0.r;
import c2.e0;
import c2.w;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfvt;
import f1.i0;
import f1.n;
import f1.t1;
import fj.l;
import g0.c0;
import g3.m0;
import i1.j;
import i1.k;
import i2.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kk.i;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.r0;
import qi.m;
import qi.s;
import rc.e;
import s.c1;
import s3.c;
import s3.o;
import s3.p;
import t.u;
import t.u0;
import t.y1;
import u6.v;
import v2.b1;
import v2.f0;
import v2.h0;
import v2.i1;
import w2.f1;
import y.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static f f11831a;

    public static final long A(long j, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j : w.c(j, w.e(j) * f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List B(k kVar, int i10, k kVar2, boolean z2, boolean z10, boolean z11) {
        s sVar;
        boolean z12;
        int i11;
        int i12;
        int iU = kVar.u(i10);
        int i13 = i10 + iU;
        int iF = kVar.f(i10);
        int iF2 = kVar.f(i13);
        int i14 = iF2 - iF;
        boolean z13 = i10 >= 0 && (kVar.f8137b[(kVar.r(i10) * 5) + 1] & 201326592) != 0;
        kVar2.w(iU);
        kVar2.x(i14, kVar2.f8154t);
        if (kVar.f8142g < i13) {
            kVar.B(i13);
        }
        if (kVar.f8145k < iF2) {
            kVar.C(iF2, i13);
        }
        int[] iArr = kVar2.f8137b;
        int i15 = kVar2.f8154t;
        int i16 = i15 * 5;
        qi.k.e0(i16, i10 * 5, i13 * 5, kVar.f8137b, iArr);
        Object[] objArr = kVar2.f8138c;
        int i17 = kVar2.f8144i;
        System.arraycopy(kVar.f8138c, iF, objArr, i17, i14);
        int i18 = kVar2.f8156v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i10;
        int i20 = i15 + iU;
        int iG = i17 - kVar2.g(iArr, i15);
        int i21 = kVar2.f8147m;
        int i22 = kVar2.f8146l;
        int length = objArr.length;
        boolean z14 = z13;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int iG2 = kVar2.g(iArr, i24) + iG;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = kVar2.f8145k;
            }
            iArr2[(i24 * 5) + 4] = k.i(iG2, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        kVar2.f8147m = i23;
        int iA = j.a(kVar.f8139d, i10, kVar.p());
        int iA2 = j.a(kVar.f8139d, i13, kVar.p());
        if (iA < iA2) {
            ArrayList arrayList = kVar.f8139d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i26 = iA; i26 < iA2; i26++) {
                i1.b bVar = (i1.b) arrayList.get(i26);
                bVar.f8101a += i19;
                arrayList2.add(bVar);
            }
            kVar2.f8139d.addAll(j.a(kVar2.f8139d, kVar2.f8154t, kVar2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            sVar = arrayList2;
        } else {
            sVar = s.f13520a;
        }
        if (!sVar.isEmpty()) {
            HashMap map = kVar.f8140e;
            HashMap map2 = kVar2.f8140e;
            if (map != null && map2 != null) {
                int size = sVar.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = kVar2.f8156v;
        kVar2.O(i18);
        int iE = kVar.E(kVar.f8137b, i10);
        if (!z11) {
            z12 = false;
        } else if (z2) {
            boolean z15 = iE >= 0;
            if (z15) {
                kVar.P();
                kVar.a(iE - kVar.f8154t);
                kVar.P();
            }
            kVar.a(i10 - kVar.f8154t);
            boolean zH = kVar.H();
            if (z15) {
                kVar.M();
                kVar.j();
                kVar.M();
                kVar.j();
            }
            z12 = zH;
        } else {
            boolean zI = kVar.I(i10, iU);
            kVar.J(iF, i14, i10 - 1);
            z12 = zI;
        }
        if (z12) {
            n.a("Unexpectedly removed anchors");
        }
        int i29 = kVar2.f8149o;
        int i30 = iArr3[i16 + 1];
        kVar2.f8149o = i29 + ((1073741824 & i30) != 0 ? 1 : i30 & 67108863);
        if (z10) {
            kVar2.f8154t = i20;
            kVar2.f8144i = i17 + i14;
        }
        if (z14) {
            kVar2.T(i18);
        }
        return sVar;
    }

    public static final void C(Object[] objArr, int i10, int i11) {
        l.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static final float D(long j, float f10, c cVar) {
        float fC;
        long jB = o.b(j);
        if (p.a(jB, 4294967296L)) {
            if (cVar.r0() <= 1.05d) {
                return cVar.W0(j);
            }
            fC = o.c(j) / o.c(cVar.Z(f10));
        } else {
            if (!p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = o.c(j);
        }
        return fC * f10;
    }

    public static final void E(Spannable spannable, long j, int i10, int i11) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(e0.E(j)), i10, i11, 33);
        }
    }

    public static final void F(Spannable spannable, long j, c cVar, int i10, int i11) {
        long jB = o.b(j);
        if (p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(hj.a.H(cVar.W0(j)), false), i10, i11, 33);
        } else if (p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j)), i10, i11, 33);
        }
    }

    public static final void G(Spannable spannable, n3.b bVar, int i10, int i11) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(m.s0(bVar));
            Iterator it = bVar.f11897a.iterator();
            while (it.hasNext()) {
                arrayList.add(((n3.a) it.next()).f11895a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }

    public static String H(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + v.j0(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + v.j0(Float.intBitsToFloat(i10)) + ", " + v.j0(Float.intBitsToFloat(i11)) + ')';
    }

    public static final Bundle I(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", "738896392656-0mnh9vjtba4b3bkvovg32tbmm8v14enn.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static WindowManager.LayoutParams J() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzim)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject K(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i10 = point2.x;
                nc.s sVar = nc.s.f12202f;
                jSONObject3.put("x", sVar.f12203a.h(context, i10));
                jSONObject3.put("y", sVar.f12203a.h(context, point2.y));
                jSONObject3.put("start_x", sVar.f12203a.h(context, point.x));
                jSONObject3.put("start_y", sVar.f12203a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e11) {
                int i11 = l0.f13401b;
                rc.k.e("Error occurred while putting signals into JSON object.", e11);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e12) {
            e = e12;
            jSONObject2 = jSONObject;
            int i12 = l0.f13401b;
            rc.k.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject L(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        int[] iArr;
        int measuredWidth;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i10 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i10];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                    } catch (JSONException unused) {
                        iArr = iArr2;
                    }
                    try {
                        nc.s sVar = nc.s.f12202f;
                        jSONObject4.put("width", sVar.f12203a.h(context, measuredWidth));
                        jSONObject4.put("height", sVar.f12203a.h(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", sVar.f12203a.h(context, iArr3[0] - iArr[0]));
                        jSONObject4.put("y", sVar.f12203a.h(context, iArr3[1] - iArr[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = S(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", sVar.f12203a.h(context, iArr3[0] - iArr[0]));
                            jSONObject.put("y", sVar.f12203a.h(context, iArr3[1] - iArr[1]));
                            jSONObject.put("relative_to", "ad_view");
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (((String) entry.getKey()).equals("3010")) {
                            zzbct zzbctVar = zzbdc.zzih;
                            t tVar = t.f12227d;
                            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                                jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzii)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject3.put("view_width_layout_type", T(layoutParams.width) - 1);
                                jSONObject3.put("view_height_layout_type", T(layoutParams.height) - 1);
                            }
                            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzij)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (scaleType != null) {
                                jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        int i11 = l0.f13401b;
                        rc.k.g("Unable to get asset views information");
                        it = it2;
                        iArr2 = iArr;
                        i10 = 2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i10 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject M(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                r0 r0Var = mc.n.D.f11577c;
                jSONObject.put("can_show_on_lock_screen", r0.E(view));
                boolean z2 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z2 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z2);
                return jSONObject;
            } catch (JSONException unused) {
                int i10 = l0.f13401b;
                rc.k.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject N(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        r0 r0Var = mc.n.D.f11577c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i10 = displayMetrics.widthPixels;
            nc.s sVar = nc.s.f12202f;
            jSONObject.put("width", sVar.f12203a.h(context, i10));
            jSONObject.put("height", sVar.f12203a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject O(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzig)).booleanValue()) {
                    r0 r0Var = mc.n.D.f11577c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                r0 r0Var2 = mc.n.D.f11577c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:66|22)|59|31|32|(4:34|(2:39|40)(1:48)|51|(2:64|53))(4:44|(2:46|47)(0)|51|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0135, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        r2 = qc.l0.f13401b;
        rc.k.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145 A[Catch: JSONException -> 0x0135, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0135, blocks: (B:31:0x0117, B:40:0x0131, B:48:0x0145, B:47:0x0141), top: B:59:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject P(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.b.P(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean Q(Context context, zzfbt zzfbtVar) {
        if (!zzfbtVar.zzN) {
            return false;
        }
        zzbct zzbctVar = zzbdc.zzik;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return ((Boolean) tVar.f12230c.zzb(zzbdc.zzin)).booleanValue();
        }
        String str = (String) tVar.f12230c.zzb(zzbdc.zzil);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzfvt.zzb(zzfup.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean R(int i10) {
        zzbct zzbctVar = zzbdc.zzdJ;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return ((Boolean) tVar.f12230c.zzb(zzbdc.zzdK)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    public static JSONObject S(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i10 = rect.right - rect.left;
        nc.s sVar = nc.s.f12202f;
        jSONObject.put("width", sVar.f12203a.h(context, i10));
        int i11 = rect.bottom - rect.top;
        e eVar = sVar.f12203a;
        jSONObject.put("height", eVar.h(context, i11));
        jSONObject.put("x", eVar.h(context, rect.left));
        jSONObject.put("y", eVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int T(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.o r39, e0.v r40, e0.c r41, b0.i1 r42, x.s0 r43, boolean r44, v.i r45, b0.i r46, b0.g r47, ej.c r48, f1.i0 r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.b.a(v1.o, e0.v, e0.c, b0.i1, x.s0, boolean, v.i, b0.i, b0.g, ej.c, f1.i0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final ej.a r19, final ej.c r20, final kj.d r21, final float r22, final fi.a r23, v1.o r24, ej.c r25, ej.a r26, f1.i0 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.b.b(ej.a, ej.c, kj.d, float, fi.a, v1.o, ej.c, ej.a, f1.i0, int, int):void");
    }

    public static final j6.b c(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new j6.b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void d(final v1.o oVar, final boolean z2, final float f10, i0 i0Var, final int i10) {
        int i11;
        i0Var.c0(-1727024699);
        int i12 = i10 & 6;
        b0.w wVar = b0.w.f1450a;
        if (i12 == 0) {
            i11 = (i0Var.f(wVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 48;
        if ((i10 & 384) == 0) {
            i13 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= i0Var.c(f10) ? 2048 : 1024;
        }
        if (i0Var.T(i13 & 1, (i13 & 1171) != 1170)) {
            if (z2) {
                i0Var.b0(-379415425);
                r.a(v.n.f(wVar.a(), w.c(w.f3054d, f10), e0.f2986b), i0Var, 0);
                i0Var.p(false);
            } else {
                i0Var.b0(-379263587);
                i0Var.p(false);
            }
            oVar = v1.l.f17564b;
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: ba.d
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(i10 | 1);
                    mk.b.d(oVar, z2, f10, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final c2.g r23, v1.o r24, f1.i0 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.b.e(c2.g, v1.o, f1.i0, int, int):void");
    }

    public static final long f(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final float[] g(h0 h0Var, fi.j jVar) {
        float fD = b2.e.d(h0Var.f17669a.a()) / 2.0f;
        float[] fArr = new float[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fArr[i10] = fD;
        }
        return fArr;
    }

    public static final String h(Object[] objArr, int i10, int i11, qi.f fVar) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == fVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        l.e(string, "toString(...)");
        return string;
    }

    public static void i(Throwable th2, Throwable th3) {
        l.f(th2, "<this>");
        l.f(th3, "exception");
        if (th2 != th3) {
            Integer num = yi.a.f20315a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = xi.a.f20072a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static final Object j(v2.j jVar, ej.a aVar, vi.c cVar) {
        Object obj;
        i1 i1VarX;
        Object objD1;
        b1 b1Var;
        v1.n nVar = (v1.n) jVar;
        boolean z2 = nVar.f17565a.G;
        if (z2) {
            if (!z2) {
                s2.a.b("visitAncestors called on an unattached node");
            }
            v1.n nVar2 = nVar.f17565a.f17569e;
            f0 f0VarY = v2.n.y(jVar);
            loop0: while (true) {
                obj = null;
                if (f0VarY == null) {
                    break;
                }
                if ((f0VarY.Y.f17586f.f17568d & 524288) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f17567c & 524288) != 0) {
                            v1.n nVarE = nVar2;
                            g1.e eVar = null;
                            while (nVarE != null) {
                                if (nVarE instanceof a3.a) {
                                    obj = nVarE;
                                    break loop0;
                                }
                                if ((nVarE.f17567c & 524288) != 0 && (nVarE instanceof v2.k)) {
                                    int i10 = 0;
                                    for (v1.n nVar3 = ((v2.k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                        if ((nVar3.f17567c & 524288) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarE = nVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar.b(nVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVarE = v2.n.e(eVar);
                            }
                        }
                        nVar2 = nVar2.f17569e;
                    }
                }
                f0VarY = f0VarY.u();
                nVar2 = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
            }
            a3.a aVar2 = (a3.a) obj;
            if (aVar2 != null && (objD1 = aVar2.d1((i1VarX = v2.n.x(jVar)), new d0(1, aVar, i1VarX), cVar)) == ui.a.f17085a) {
                return objD1;
            }
        }
        return pi.o.f13011a;
    }

    public static Object k(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static int l(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void m(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }

    public static final k3.k n(Context context) {
        return new k3.k(new k3.a(context, 0), new k3.b(Build.VERSION.SDK_INT >= 31 ? k3.t.f9402a.a(context) : 0));
    }

    public static d o(String str, String str2) throws d5.a {
        Exception excH;
        try {
            a5.c cVar = new a5.c(new b5.a(26), (String) null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excH = hj.a.h(new b5.a(0), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excH = hj.a.h(new b5.a(1), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excH = hj.a.h(new b5.a(3), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excH = hj.a.h(new b5.a(4), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excH = hj.a.h(new b5.a(10), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_NAMESPACE_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excH = hj.a.h(new b5.a(12), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excH = hj.a.h(new b5.a(14), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excH = hj.a.h(new b5.a(16), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excH = hj.a.h(new b5.a(17), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_OPERATION_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_OPT_OUT_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_READ_ONLY_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excH = hj.a.h(new b5.a(22), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_SYNTAX_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excH = hj.a.h(new b5.a(24), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excH = hj.a.h(new b5.a(26), str2, cVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_VERSION_ERROR"), str2, cVar);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new d5.a();
                }
                excH = hj.a.h(new b5.a("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str2, cVar);
            }
            return (d) excH;
        } catch (d5.a unused) {
            return new a5.c(str, str2);
        }
    }

    public static i p(String str) {
        l.f(str, "<this>");
        byte[] bytes = str.getBytes(nj.a.f12342a);
        l.e(bytes, "getBytes(...)");
        i iVar = new i(bytes);
        iVar.f9703c = str;
        return iVar;
    }

    public static final boolean q(long j, long j4) {
        return j == j4;
    }

    public static g r(g0.h0 h0Var, i0 i0Var, int i10, int i11) {
        c0 c0Var = new c0();
        u uVarA = c1.a(i0Var);
        Object obj = y1.f15332a;
        boolean z2 = true;
        u0 u0VarS = t.d.s(0.0f, 400.0f, Float.valueOf(1), 1);
        float f10 = (i11 & 16) != 0 ? 0.5f : 0.8f;
        if (0.0f > f10 || f10 > 1.0f) {
            a0.a.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10);
        }
        Object obj2 = (c) i0Var.j(f1.f18262h);
        s3.m mVar = (s3.m) i0Var.j(f1.f18267n);
        boolean zF = ((((i10 & 14) ^ 6) > 4 && i0Var.f(h0Var)) || (i10 & 6) == 4) | i0Var.f(uVarA) | i0Var.f(u0VarS);
        if ((((i10 & 112) ^ 48) <= 32 || !i0Var.f(c0Var)) && (i10 & 48) != 32) {
            z2 = false;
        }
        boolean zF2 = zF | z2 | i0Var.f(obj2) | i0Var.d(mVar.ordinal());
        Object objQ = i0Var.Q();
        if (zF2 || objQ == f1.m.f6385a) {
            q5.b bVar = new q5.b(h0Var, new g0.p(h0Var, mVar, f10), c0Var);
            float f11 = y.k.f20151a;
            objQ = new g(bVar, uVarA, u0VarS);
            i0Var.l0(objQ);
        }
        return (g) objQ;
    }

    public static final String s() {
        byte[] bArr = new byte[16];
        pj.a.f13014a.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long jC = x8.a.C(0, bArr);
        long jC2 = x8.a.C(8, bArr);
        return ((jC == 0 && jC2 == 0) ? pj.b.f13015c : new pj.b(jC, jC2)).toString();
    }

    public static final g3.f t(l3.t tVar) {
        g3.f fVar = tVar.f9937a;
        long j = tVar.f9938b;
        fVar.getClass();
        return fVar.subSequence(m0.f(j), m0.e(j));
    }

    public static final g3.f u(l3.t tVar, int i10) {
        g3.f fVar = tVar.f9937a;
        g3.f fVar2 = tVar.f9937a;
        long j = tVar.f9938b;
        int iE = m0.e(j);
        int iE2 = m0.e(j);
        int length = iE2 + i10;
        if (((i10 ^ length) & (iE2 ^ length)) < 0) {
            length = fVar2.f7081b.length();
        }
        return fVar.subSequence(iE, Math.min(length, fVar2.f7081b.length()));
    }

    public static final g3.f v(l3.t tVar, int i10) {
        g3.f fVar = tVar.f9937a;
        long j = tVar.f9938b;
        int iF = m0.f(j);
        int i11 = iF - i10;
        if (((iF ^ i11) & (i10 ^ iF)) < 0) {
            i11 = 0;
        }
        return fVar.subSequence(Math.max(0, i11), m0.f(j));
    }

    public static boolean w(String str) {
        p7.b bVar = p7.n.f12815a;
        Set<p7.g> setUnmodifiableSet = Collections.unmodifiableSet(p7.c.f12805c);
        HashSet hashSet = new HashSet();
        for (p7.g gVar : setUnmodifiableSet) {
            if (((p7.c) gVar).f12806a.equals(str)) {
                hashSet.add(gVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p7.c cVar = (p7.c) ((p7.g) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(byte b10) {
        return b10 > -65;
    }

    public static mj.g y(ej.e eVar) {
        mj.g gVar = new mj.g();
        gVar.f11826c = u3.a.a(eVar, gVar, gVar);
        return gVar;
    }

    public static Comparable z(s3.f fVar, s3.f fVar2, s3.f fVar3) {
        if (fVar2.compareTo(fVar3) < 0) {
            fVar2 = fVar3;
        }
        return fVar.compareTo(fVar2) >= 0 ? fVar : fVar2;
    }
}
