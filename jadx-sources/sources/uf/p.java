package uf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f1.a1;
import f1.g1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import m.m1;
import m.r1;
import zf.q1;
import zf.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements kg.c, mg.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f17052a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17053b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17054c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17055d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17056e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17057f;

    public static boolean k(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static p m(String str, com.google.crypto.tink.shaded.protobuf.i iVar, w0 w0Var, q1 q1Var, Integer num) throws GeneralSecurityException {
        if (q1Var == q1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        p pVar = new p();
        pVar.f17052a = str;
        pVar.f17053b = u.b(str);
        pVar.f17054c = iVar;
        pVar.f17055d = w0Var;
        pVar.f17056e = q1Var;
        pVar.f17057f = num;
        return pVar;
    }

    public static ColorStateList o(Context context, int i10) {
        int iC = r1.c(context, R.attr.colorControlHighlight);
        int iB = r1.b(context, R.attr.colorButtonNormal);
        int[] iArr = r1.f11172b;
        int[] iArr2 = r1.f11174d;
        int iB2 = l4.a.b(iC, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, r1.f11173c, r1.f11176f}, new int[]{iB, iB2, l4.a.b(iC, i10), i10});
    }

    public static LayerDrawable q(m1 m1Var, Context context, int i10) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableC = m1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = m1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void t(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = m.p.f11155b;
        }
        drawableMutate.setColorFilter(m.p.b(i10, mode));
    }

    @Override // kg.c
    public Object a(Class cls) {
        if (!((Set) this.f17052a).contains(kg.r.a(cls))) {
            throw new b3.e("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((kg.c) this.f17057f).a(cls);
        if (!cls.equals(ih.a.class)) {
            return objA;
        }
        return new kg.s();
    }

    @Override // kg.c
    public oh.b b(Class cls) {
        return e(kg.r.a(cls));
    }

    @Override // mg.l
    public void c(mg.b bVar) {
        fj.l.f(bVar, "error");
    }

    @Override // kg.c
    public kg.p d(kg.r rVar) {
        if (((Set) this.f17054c).contains(rVar)) {
            return ((kg.c) this.f17057f).d(rVar);
        }
        throw new b3.e("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // kg.c
    public oh.b e(kg.r rVar) {
        if (((Set) this.f17053b).contains(rVar)) {
            return ((kg.c) this.f17057f).e(rVar);
        }
        throw new b3.e("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // kg.c
    public Object f(kg.r rVar) {
        if (((Set) this.f17052a).contains(rVar)) {
            return ((kg.c) this.f17057f).f(rVar);
        }
        throw new b3.e("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // kg.c
    public Set g(kg.r rVar) {
        if (((Set) this.f17055d).contains(rVar)) {
            return ((kg.c) this.f17057f).g(rVar);
        }
        throw new b3.e("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // kg.c
    public oh.b h(kg.r rVar) {
        if (((Set) this.f17056e).contains(rVar)) {
            return ((kg.c) this.f17057f).h(rVar);
        }
        throw new b3.e("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    @Override // kg.c
    public kg.p i(Class cls) {
        return d(kg.r.a(cls));
    }

    public void j(String str, String str2) {
        HashMap map = (HashMap) this.f17056e;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public ub.h l() {
        String strV = ((String) this.f17052a) == null ? " transportName" : "";
        if (((ub.l) this.f17053b) == null) {
            strV = strV.concat(" encodedPayload");
        }
        if (((Long) this.f17054c) == null) {
            strV = t.m1.v(strV, " eventMillis");
        }
        if (((Long) this.f17055d) == null) {
            strV = t.m1.v(strV, " uptimeMillis");
        }
        if (((HashMap) this.f17056e) == null) {
            strV = t.m1.v(strV, " autoMetadata");
        }
        if (strV.isEmpty()) {
            return new ub.h((String) this.f17052a, (Integer) this.f17057f, (ub.l) this.f17053b, ((Long) this.f17054c).longValue(), ((Long) this.f17055d).longValue(), (HashMap) this.f17056e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strV));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg.l
    public void n(mg.a aVar) {
        Integer numB0;
        Object next;
        if (fj.l.b((String) ((a1) this.f17052a).getValue(), "dev")) {
            aVar = aVar.a("dev");
        }
        mg.a aVarA = aVar.a("latestApk");
        ((a1) this.f17053b).setValue((String) aVarA.a("versionName").c(String.class));
        Object value = aVarA.a("versionCode").f11667a.f20605a.getValue();
        ((g1) this.f17054c).h(value instanceof Long ? (int) ((Number) value).longValue() : value instanceof Integer ? ((Number) value).intValue() : (!(value instanceof String) || (numB0 = nj.l.B0((String) value)) == null) ? 0 : numB0.intValue());
        ((a1) this.f17055d).setValue((String) aVarA.a("apkUrl").c(String.class));
        a1 a1Var = (a1) this.f17056e;
        Iterator it = qi.k.c0(new String[]{aVarA.a("updateImageUrl").c(String.class), aVarA.a("previewImageUrl").c(String.class), aVarA.a("imageUrl").c(String.class)}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            if (str != null && !nj.e.K0(str)) {
                break;
            }
        }
        a1Var.setValue((String) next);
        ((a1) this.f17057f).setValue((String) aVarA.a("releaseNotes").c(String.class));
    }

    public Task p(Task task) {
        return task.continueWith(new n.a(1), new t1.f(this, 4));
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return i4.c.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return i4.c.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return o(context, r1.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return o(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return o(context, r1.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return i4.c.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (k((int[]) this.f17053b, i10)) {
                return r1.d(context, R.attr.colorControlNormal);
            }
            if (k((int[]) this.f17056e, i10)) {
                return i4.c.getColorStateList(context, R.color.abc_tint_default);
            }
            if (k((int[]) this.f17057f, i10)) {
                return i4.c.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return i4.c.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = r1.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = r1.f11172b;
            iArr2[0] = r1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = r1.f11175e;
            iArr2[1] = r1.c(context, R.attr.colorControlActivated);
            iArr[2] = r1.f11176f;
            iArr2[2] = r1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = r1.f11172b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = r1.f11175e;
            iArr2[1] = r1.c(context, R.attr.colorControlActivated);
            iArr[2] = r1.f11176f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.p.s(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Task u(String str, String str2, Bundle bundle) {
        try {
            s(str, str2, bundle);
            return ((md.b) this.f17054c).a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
