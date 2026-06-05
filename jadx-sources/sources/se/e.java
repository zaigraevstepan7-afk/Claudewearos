package se;

import ac.h;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.anonlab.voidlauncher.R;
import com.google.android.material.button.MaterialButton;
import ef.i;
import ef.m;
import ef.x;
import ef.z;
import q5.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f15002a;

    /* renamed from: b, reason: collision with root package name */
    public m f15003b;

    /* renamed from: c, reason: collision with root package name */
    public z f15004c;

    /* renamed from: d, reason: collision with root package name */
    public g f15005d;

    /* renamed from: e, reason: collision with root package name */
    public h f15006e;

    /* renamed from: f, reason: collision with root package name */
    public int f15007f;

    /* renamed from: g, reason: collision with root package name */
    public int f15008g;

    /* renamed from: h, reason: collision with root package name */
    public int f15009h;

    /* renamed from: i, reason: collision with root package name */
    public int f15010i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f15011k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f15012l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f15013m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f15014n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f15015o;

    /* renamed from: p, reason: collision with root package name */
    public i f15016p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15020t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f15022v;

    /* renamed from: w, reason: collision with root package name */
    public int f15023w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15017q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15018r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15019s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15021u = true;

    public e(MaterialButton materialButton, m mVar) {
        this.f15002a = materialButton;
        this.f15003b = mVar;
    }

    public final i a(boolean z2) {
        RippleDrawable rippleDrawable = this.f15022v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f15022v.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void b(int i10, int i11) {
        MaterialButton materialButton = this.f15002a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f15009h;
        int i13 = this.f15010i;
        this.f15010i = i11;
        this.f15009h = i10;
        if (!this.f15018r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void c() {
        i iVar = new i(this.f15003b);
        z zVar = this.f15004c;
        if (zVar != null) {
            iVar.o(zVar);
        }
        g gVar = this.f15005d;
        if (gVar != null) {
            iVar.l(gVar);
        }
        h hVar = this.f15006e;
        if (hVar != null) {
            iVar.W = hVar;
        }
        MaterialButton materialButton = this.f15002a;
        iVar.k(materialButton.getContext());
        iVar.setTintList(this.f15013m);
        PorterDuff.Mode mode = this.f15012l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f10 = this.f15011k;
        ColorStateList colorStateList = this.f15014n;
        iVar.f6000b.f5991k = f10;
        iVar.invalidateSelf();
        ef.g gVar2 = iVar.f6000b;
        if (gVar2.f5986e != colorStateList) {
            gVar2.f5986e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.f15003b);
        z zVar2 = this.f15004c;
        if (zVar2 != null) {
            iVar2.o(zVar2);
        }
        g gVar3 = this.f15005d;
        if (gVar3 != null) {
            iVar2.l(gVar3);
        }
        iVar2.setTint(0);
        float f11 = this.f15011k;
        int iJ = this.f15017q ? u2.b.j(materialButton, R.attr.colorSurface) : 0;
        iVar2.f6000b.f5991k = f11;
        iVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
        ef.g gVar4 = iVar2.f6000b;
        if (gVar4.f5986e != colorStateListValueOf) {
            gVar4.f5986e = colorStateListValueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.f15003b);
        this.f15016p = iVar3;
        z zVar3 = this.f15004c;
        if (zVar3 != null) {
            iVar3.o(zVar3);
        }
        g gVar5 = this.f15005d;
        if (gVar5 != null) {
            this.f15016p.l(gVar5);
        }
        this.f15016p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(cf.a.a(this.f15015o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f15007f, this.f15009h, this.f15008g, this.f15010i), this.f15016p);
        this.f15022v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i iVarA = a(false);
        if (iVarA != null) {
            iVarA.m(this.f15023w);
            iVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        i iVarA = a(false);
        if (iVarA != null) {
            z zVar = this.f15004c;
            if (zVar != null) {
                iVarA.o(zVar);
            } else {
                iVarA.setShapeAppearanceModel(this.f15003b);
            }
            g gVar = this.f15005d;
            if (gVar != null) {
                iVarA.l(gVar);
            }
        }
        i iVarA2 = a(true);
        if (iVarA2 != null) {
            z zVar2 = this.f15004c;
            if (zVar2 != null) {
                iVarA2.o(zVar2);
            } else {
                iVarA2.setShapeAppearanceModel(this.f15003b);
            }
            g gVar2 = this.f15005d;
            if (gVar2 != null) {
                iVarA2.l(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f15022v;
        x xVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f15022v.getNumberOfLayers() > 2 ? (x) this.f15022v.getDrawable(2) : (x) this.f15022v.getDrawable(1);
        if (xVar != null) {
            xVar.setShapeAppearanceModel(this.f15003b);
            if (xVar instanceof i) {
                i iVar = (i) xVar;
                z zVar3 = this.f15004c;
                if (zVar3 != null) {
                    iVar.o(zVar3);
                }
                g gVar3 = this.f15005d;
                if (gVar3 != null) {
                    iVar.l(gVar3);
                }
            }
        }
    }

    public final void e() {
        i iVarA = a(false);
        i iVarA2 = a(true);
        if (iVarA != null) {
            float f10 = this.f15011k;
            ColorStateList colorStateList = this.f15014n;
            iVarA.f6000b.f5991k = f10;
            iVarA.invalidateSelf();
            ef.g gVar = iVarA.f6000b;
            if (gVar.f5986e != colorStateList) {
                gVar.f5986e = colorStateList;
                iVarA.onStateChange(iVarA.getState());
            }
            if (iVarA2 != null) {
                float f11 = this.f15011k;
                int iJ = this.f15017q ? u2.b.j(this.f15002a, R.attr.colorSurface) : 0;
                iVarA2.f6000b.f5991k = f11;
                iVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
                ef.g gVar2 = iVarA2.f6000b;
                if (gVar2.f5986e != colorStateListValueOf) {
                    gVar2.f5986e = colorStateListValueOf;
                    iVarA2.onStateChange(iVarA2.getState());
                }
            }
        }
    }
}
