package hf;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.anonlab.voidlauncher.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f7919e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7920f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7921g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f7922h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f7923i;
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final k f7924k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7925l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7926m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7927n;

    /* renamed from: o, reason: collision with root package name */
    public long f7928o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f7929p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f7930q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f7931r;

    /* JADX WARN: Type inference failed for: r0v2, types: [hf.k] */
    public m(q qVar) {
        super(qVar);
        this.f7923i = new com.google.android.material.datepicker.n(this, 2);
        this.j = new a(this, 1);
        this.f7924k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: hf.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                m mVar = this.f7916a;
                AutoCompleteTextView autoCompleteTextView = mVar.f7922h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                mVar.f7949d.setImportantForAccessibility(z2 ? 2 : 1);
            }
        };
        this.f7928o = Long.MAX_VALUE;
        this.f7920f = yd.f.b0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f7919e = yd.f.b0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f7921g = yd.f.c0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, ne.a.f12301a);
    }

    @Override // hf.r
    public final void a() {
        if (this.f7929p.isTouchExplorationEnabled() && this.f7922h.getInputType() != 0 && !this.f7949d.hasFocus()) {
            this.f7922h.dismissDropDown();
        }
        this.f7922h.post(new ac.o(this, 11));
    }

    @Override // hf.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // hf.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // hf.r
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // hf.r
    public final View.OnClickListener f() {
        return this.f7923i;
    }

    @Override // hf.r
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f7924k;
    }

    @Override // hf.r
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // hf.r
    public final boolean k() {
        return this.f7927n;
    }

    @Override // hf.r
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f7922h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: hf.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    m mVar = this.f7914a;
                    long j = jUptimeMillis - mVar.f7928o;
                    if (j < 0 || j > 300) {
                        mVar.f7926m = false;
                    }
                    mVar.t();
                    mVar.f7926m = true;
                    mVar.f7928o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f7922h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: hf.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = this.f7915a;
                mVar.f7926m = true;
                mVar.f7928o = SystemClock.uptimeMillis();
                mVar.s(false);
            }
        });
        this.f7922h.setThreshold(0);
        TextInputLayout textInputLayout = this.f7946a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f7929p.isTouchExplorationEnabled()) {
            this.f7949d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // hf.r
    public final void m(u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        if (this.f7922h.getInputType() == 0) {
            eVar.i(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // hf.r
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f7929p.isEnabled() && this.f7922h.getInputType() == 0) {
            boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f7927n && !this.f7922h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z2) {
                t();
                this.f7926m = true;
                this.f7928o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // hf.r
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7921g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f7920f);
        int i10 = 0;
        valueAnimatorOfFloat.addUpdateListener(new h(this, i10));
        this.f7931r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f7919e);
        valueAnimatorOfFloat2.addUpdateListener(new h(this, i10));
        this.f7930q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new l(this, i10));
        this.f7929p = (AccessibilityManager) this.f7948c.getSystemService("accessibility");
    }

    @Override // hf.r
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f7922h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f7922h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z2) {
        if (this.f7927n != z2) {
            this.f7927n = z2;
            this.f7931r.cancel();
            this.f7930q.start();
        }
    }

    public final void t() {
        if (this.f7922h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f7928o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f7926m = false;
        }
        if (this.f7926m) {
            this.f7926m = false;
            return;
        }
        s(!this.f7927n);
        if (!this.f7927n) {
            this.f7922h.dismissDropDown();
        } else {
            this.f7922h.requestFocus();
            this.f7922h.showDropDown();
        }
    }
}
