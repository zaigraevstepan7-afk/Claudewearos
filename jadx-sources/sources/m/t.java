package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class t extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final m f11182a;

    /* renamed from: b, reason: collision with root package name */
    public final ak.x f11183b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s1.a(context);
        this.f11184c = false;
        r1.a(getContext(), this);
        m mVar = new m(this);
        this.f11182a = mVar;
        mVar.d(attributeSet, i10);
        ak.x xVar = new ak.x(this);
        this.f11183b = xVar;
        xVar.i(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11182a;
        if (mVar != null) {
            mVar.a();
        }
        ak.x xVar = this.f11183b;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f11182a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11182a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        ak.g gVar;
        ak.x xVar = this.f11183b;
        if (xVar == null || (gVar = (ak.g) xVar.f744d) == null) {
            return null;
        }
        return (ColorStateList) gVar.f636c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ak.g gVar;
        ak.x xVar = this.f11183b;
        if (xVar == null || (gVar = (ak.g) xVar.f744d) == null) {
            return null;
        }
        return (PorterDuff.Mode) gVar.f637d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f11183b.f743c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11182a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11182a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ak.x xVar = this.f11183b;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ak.x xVar = this.f11183b;
        if (xVar != null && drawable != null && !this.f11184c) {
            xVar.f742b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xVar != null) {
            xVar.b();
            if (this.f11184c) {
                return;
            }
            ImageView imageView = (ImageView) xVar.f743c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xVar.f742b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f11184c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        ak.x xVar = this.f11183b;
        ImageView imageView = (ImageView) xVar.f743c;
        if (i10 != 0) {
            Drawable drawableG = u6.v.G(imageView.getContext(), i10);
            if (drawableG != null) {
                n0.a(drawableG);
            }
            imageView.setImageDrawable(drawableG);
        } else {
            imageView.setImageDrawable(null);
        }
        xVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ak.x xVar = this.f11183b;
        if (xVar != null) {
            xVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11182a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11182a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ak.x xVar = this.f11183b;
        if (xVar != null) {
            if (((ak.g) xVar.f744d) == null) {
                xVar.f744d = new ak.g();
            }
            ak.g gVar = (ak.g) xVar.f744d;
            gVar.f636c = colorStateList;
            gVar.f635b = true;
            xVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ak.x xVar = this.f11183b;
        if (xVar != null) {
            if (((ak.g) xVar.f744d) == null) {
                xVar.f744d = new ak.g();
            }
            ak.g gVar = (ak.g) xVar.f744d;
            gVar.f637d = mode;
            gVar.f634a = true;
            xVar.b();
        }
    }
}
